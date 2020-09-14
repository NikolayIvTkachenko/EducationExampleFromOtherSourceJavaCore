/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author tkach
 */
public class SocketTest {
    public static void main (String[] args) throws IOException{
        try(Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13)){
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);
            
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }
    }
}
