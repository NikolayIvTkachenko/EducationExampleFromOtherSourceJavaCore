/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_4_1;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tkach
 */
public class TestDB {
    
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException{
        
        try{
            
            runTest();
            
        }catch(SQLException ex){
            for(Throwable t: ex)
                t.printStackTrace();
        }
        
    }
    
    public static void runTest() throws SQLException, IOException, InstantiationException, IllegalAccessException{
        try(Connection conn = getConnection()){
            
            Statement stat = conn.createStatement();
            stat.executeUpdate("CREATE TABLE Greetings (Message CHAR(20))");
            stat.executeUpdate("INSERT INTO Greetings VALUES ('Hello, World!')");
            
            try(ResultSet result = stat.executeQuery("SELECT * FROM Greetings")){
                if(result.next()){
                    System.out.println(result.getString(1));
                }
            }
            
            stat.executeUpdate("DROP TABLE Greetings");
        }
    }
    
    
    public static Connection getConnection() throws SQLException, IOException, InstantiationException, IllegalAccessException{
        
        Properties props = new Properties();
        //try(InputStream in = Files.newInputStream(Paths.get("database.properties"))){
        try(InputStream in = Files.newInputStream(Paths.get("mysql.properties"))){
            props.load(in);
        }
        
        String drivers = props.getProperty("jdbc.drivers");
        if(drivers != null) System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
        
        System.out.println("drivers = "+drivers );
        System.out.println("url = "+url );
        System.out.println("username = "+username );
        System.out.println("password  = "+password  );
        
        
        return (Connection) DriverManager.getConnection(url, username, password);
        
        /*try {
            //return (Connection) DriverManager.getConnection(url, username, password);

            DriverManager.registerDriver((java.sql.Driver) Class.forName(drivers).newInstance());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conn = DriverManager.getConnection(url, username, password);
        
        return conn;*/
        
    }
    
}
