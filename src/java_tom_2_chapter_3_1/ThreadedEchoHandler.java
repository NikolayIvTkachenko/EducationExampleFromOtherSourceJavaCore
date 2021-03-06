/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author tkach
 */
public class ThreadedEchoHandler implements Runnable{

    private Socket incoming;
    
    public ThreadedEchoHandler(Socket i){
        incoming = i;
    }
    
    @Override
    public void run() {
        try{
            try{
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();
                
                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream, true);
                
                out.println();
                out.println("Hello! ENter BYE to exit");
                
                boolean done = false;
                while(!done && in.hasNextLine()){
                    String line = in.nextLine();
                    out.println();
                    out.println("Echo: "+line);
                    if(line.trim().equals("BYE"))
                        done=true;
                }
                
                
            }finally{
                incoming.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
