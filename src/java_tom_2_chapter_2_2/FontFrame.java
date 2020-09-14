/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author tkach
 */
public class FontFrame extends JFrame{
    
    private GridBagPane gridbag;
    private JComboBox<String> face;
    private JComboBox<String> size;
    private JCheckBox bold;
    private JCheckBox italic;
    
    @SuppressWarnings("unchecked")
    public FontFrame(File file){
        
        gridbag = new GridBagPane(file);
        add(gridbag);
        
        face = (JComboBox<String>) gridbag.get("face");
        size = (JComboBox<String>) gridbag.get("size");
        
        bold = (JCheckBox)gridbag.get("bold");
        italic = (JCheckBox)gridbag.get("italic");
        
        face.setModel(new DefaultComboBoxModel<String>(new String[]{"Serif", 
            "SansSerif", "Monospaced", "Dialog", "DialogInput"}));
        size.setModel(new DefaultComboBoxModel<String>(new String[]{"8","10",
            "12","15","18","24", "36", "48" }));
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSample();
            }
        };
        
        face.addActionListener(listener);
        size.addActionListener(listener);
        bold.addActionListener(listener);
        italic.addActionListener(listener);
        
        setSample();
        pack();
    }
    
    
    public void setSample(){
        String fontFace = face.getItemAt(face.getSelectedIndex());
        int fontSize = Integer.parseInt(size.getItemAt(size.getSelectedIndex()));
        
        JTextArea sample = (JTextArea)gridbag.get("sample");
        int fontStyle = (bold.isSelected() ? Font.BOLD:0)+
                (italic.isSelected() ? Font.ITALIC : 0);
        
        sample.setFont(new Font(fontFace, fontStyle, fontSize));
        sample.repaint();
        
    }
}
