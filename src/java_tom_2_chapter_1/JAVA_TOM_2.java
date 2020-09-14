/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.zip.ZipInputStream;

/**
 *
 * @author tkach
 */
public class JAVA_TOM_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //1
        FileInputStream fin1 = new FileInputStream("employy.dat");
        DataInputStream din1 = new DataInputStream(fin1);
        
        double s = din1.readDouble();
        
        
        //2
        DataInputStream din2 = new DataInputStream(new BufferedInputStream(new FileInputStream("employee.dat")));
        
        
        //3
        PushbackInputStream pbin = 
                new PushbackInputStream(new BufferedInputStream(new FileInputStream("employee.dat")));
        
        int b = pbin.read();
        if(b != '<')pbin.unread(b);
        
        //4
        ZipInputStream zin = new ZipInputStream(new FileInputStream("employee.zip"));
        DataInputStream din4 = new DataInputStream(zin);
        
        
    }
    
}
