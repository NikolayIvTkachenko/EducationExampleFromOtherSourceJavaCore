/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_4_4;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author tkach
 */
public class ViewDBFrame extends JFrame{
    
    private JButton previousButton;
    private JButton nextButton;
    private JButton deleteButton;
    private JButton saveButton;
    private DataPanel dataPanel;
    private Component scrollPane;
    private JComboBox<String> tableNames;
    private Properties props;
    private CachedRowSet crs;
    
    
    public ViewDBFrame(){
        
        tableNames = new JComboBox<String>();
        tableNames.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showTable((String) tableNames.getSelectedItem());
            }
        });
        
        add(tableNames, BorderLayout.NORTH);
        
        try{
            readDatabaseProperties();
            try(Connection conn = getConnection()){
                DatabaseMetaData meta = conn.getMetaData();
                ResultSet mrs 
                        = meta.getTables(null, null, null, new String[]{"TABLE"});
                
                while(mrs.next()){
                    tableNames.addItem(mrs.getString(3));
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, e);
        }
        
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);
        
        previousButton = new JButton("Previous");
        previousButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                showPreviousRow();
            }
        });
        
        buttonPanel.add(previousButton);
        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextRow();
            }
        });
        
        buttonPanel.add(nextButton);
        
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRow();
            }
        });
        buttonPanel.add(deleteButton);
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                saveChanged();
            }
        });
        buttonPanel.add(saveButton);
        
        pack();
    }
    
    public void showTable(String tableName) {
        try{
            
            try(Connection conn = getConnection()){
                
                Statement stat = conn.createStatement();
                ResultSet result = stat.executeQuery("SELECT * FROM "+tableName);
                RowSetFactory factory = RowSetProvider.newFactory();
                crs = factory.createCachedRowSet();
                crs.setTableName(tableName);
                crs.populate(result);
                
            }
            
            if(scrollPane != null) remove(scrollPane);
            dataPanel = new DataPanel(crs);
            scrollPane = new JScrollPane(dataPanel);
            add(scrollPane, BorderLayout.CENTER);
            
            validate();
            showNextRow();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    
    public void showPreviousRow(){
        try{
            if(crs == null || crs.isFirst()) return;
            crs.previous();
            dataPanel.showRow(crs);
            
        }catch(SQLException e){
            for(Throwable t : e)
                t.printStackTrace();
        }
    }
    
    
    public void showNextRow(){
        try{
            if(crs == null || crs.isLast()) return;
            crs.next();
            dataPanel.showRow(crs);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    
    
    public void deleteRow(){
        try{
            try(Connection conn = getConnection()){
                crs.deleteRow();
                crs.acceptChanges(conn);
                
                if(crs.isAfterLast())
                    if(!crs.last()) crs = null;
                
                dataPanel.showRow(crs);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void saveChanged(){
        try{
            try(Connection conn = getConnection()){
                dataPanel.setRow(crs);
                crs.acceptChanges(conn);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    
    
    
    public void readDatabaseProperties() throws IOException{
        props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("mysql.properties"))) {
            props.load(in);
        }

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
    }
    

    public Connection getConnection() throws SQLException {

        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }
}
