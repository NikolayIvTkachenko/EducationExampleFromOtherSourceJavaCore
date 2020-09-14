/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_9_1;

import java.io.*;
/**
 *
 * @author tkach
 */
public class Caesar {
    
    public static void main(String[] args) throws Exception{
        
        if(args.length != 3){
            System.out.println("USAGE: java classLoader.Ceasar in our key ");
            return;
        }
        
        try(FileInputStream in = 
                new FileInputStream(
                        args[0]);
                        FileOutputStream out = new FileOutputStream(args[1]))
        {
            int key = Integer.parseInt(args[2]);
            int ch;
            
            while((ch = in.read()) != -1){
                byte c = (byte)(ch + key);
                out.write(c);
            }
        }
    }
}
