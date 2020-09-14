/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author tkach
 */
public class InterraptibleSocketFrame extends JFrame {

    public static final int TEXT_ROWS = 20;
    public static final int TEXT_COLUMNS = 60;

    private Scanner in;
    private JButton interruptibleButton;
    private JButton blockingButton;
    private JButton cancelButton;
    private JTextArea messages;
    private TestServer server;
    private Thread connectThread;
    
    public InterraptibleSocketFrame(){
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        
        messages = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
        add(new JScrollPane(messages));
        
        interruptibleButton = new JButton("Interruptible");
        blockingButton = new JButton("Blocking");
        cancelButton = new JButton("Cancel");
        northPanel.add(interruptibleButton);
        northPanel.add(blockingButton);
        cancelButton.setEnabled(false);
        northPanel.add(cancelButton);
        
        
        interruptibleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                interruptibleButton.setEnabled(false);
                blockingButton.setEnabled(false);
                cancelButton.setEnabled(true);
                connectThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                         
                        try{
                           
                            connectInterruptibly();
                            
                        }catch(IOException e){
                            messages.append("\nInterruptib;eSocketTest.connectInterruptibly: "+e);
                        }
                    }
                });
                connectThread.start();
            }
        });
        
        blockingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
                interruptibleButton.setEnabled(false);
                blockingButton.setEnabled(false);
                cancelButton.setEnabled(true);
                
                connectThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                         
                        try{
                           
                            connectBlocking();
                            
                        }catch(IOException e){
                            messages.append("\nInterruptib;eSocketTest.connectInterruptibly: "+e);
                        }
                    }
                });
                connectThread.start();
                
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectThread.interrupt();
                cancelButton.setEnabled(false);
            }
        });
        
        server = new TestServer();
        new Thread(server).start();
        pack();
        
    }
    
    public void connectInterruptibly() throws IOException{
        
        messages.append("Interruptible:\n");
        try(SocketChannel channel = SocketChannel.open(new InetSocketAddress("localhost", 8189))){
            
            in = new Scanner(channel);
            
            while(!Thread.currentThread().isInterrupted()){
                messages.append("Reading ");
                if(in.hasNextLine()){
                    String line = in.nextLine();
                    messages.append(line);
                    messages.append("\n");
                }
            } 
        }finally{
            EventQueue.invokeLater(new Runnable(){
                @Override
                public void run() {
                     
                    messages.append("Channel closed\n");
                    interruptibleButton.setEnabled(true);
                    blockingButton.setEnabled(true);
                }
            });
        }
    }
    
    
    
    public void connectBlocking() throws IOException{
        
        messages.append("Blocking:\n");
        try(Socket sock = new Socket("localhost", 8189)){
            in = new Scanner(sock.getInputStream());
            
            while(!Thread.currentThread().isInterrupted()){
                messages.append("Reading ");
                if(in.hasNextLine()){
                    String line = in.nextLine();
                    messages.append(line);
                    messages.append("\n");
                }
            }
        }finally{
            EventQueue.invokeLater(new Runnable(){
                @Override
                public void run() {
                     
                    messages.append("Socket closed\n");
                    interruptibleButton.setEnabled(true);
                    blockingButton.setEnabled(true);
                }
            });
        }
        
        
    }
    
    public class TestServer implements Runnable {

    @Override
    public void run() {
        try{
            ServerSocket s = new ServerSocket(8189);
            
            while(true){
                Socket incoming = s.accept();
                Runnable r = new TestServerHandler(incoming);
                Thread t = new Thread(r);
                t.start();
            } 
        }catch(IOException e){
            messages.append("\nTestServer.run: "+e);
        }
    }
    
}

    public class TestServerHandler implements Runnable {

        private Socket incoming;
        private int counter;

        public TestServerHandler(Socket i) {
            incoming = i;
        }

        @Override
        public void run() {
            try {
                try {

                    OutputStream outStream = incoming.getOutputStream();
                    PrintWriter out = new PrintWriter(outStream, true);

                    while (counter < 100) {
                        counter++;

                        if (counter <= 10) {
                            out.println(counter);
                        }
                        Thread.sleep(100);
                    }
                } finally {
                    incoming.close();
                    messages.append("Closing server\n");
                }
            } catch (Exception e) {
                messages.append("\nTestServerHandler.run: "+e);

            }
        }
    }
}
