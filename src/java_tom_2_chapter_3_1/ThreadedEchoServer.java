/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author tkach
 */
public class ThreadedEchoServer {
    public static void main(String[] args){
        
        try{
            int i = 1;
            ServerSocket s = new ServerSocket(8189);
            
            while(true){
                Socket incoming = s.accept();
                System.out.println("Spawing "+i);
                
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
