/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_5;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author tkach
 */
public class InterruptibleSocketTest {
    public static void main(String[] args){
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 
                JFrame frame = new InterraptibleSocketFrame();
                frame.setTitle("InterruptibleSocketTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                
            }
        });
        
    }
}
