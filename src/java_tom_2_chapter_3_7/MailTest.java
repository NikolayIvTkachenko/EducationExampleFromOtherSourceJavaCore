/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_7;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author tkach
 */
public class MailTest {
    
    public static void main(String[] args) throws MessagingException, IOException, AddressException, javax.mail.MessagingException{
        
        Properties props = new Properties();
        try(InputStream in = Files.newInputStream(Paths.get("mail", "mail.properties"))){
            props.load(in);
        }
        
        //List<String> lines = Files.readAllLines(Paths.get(args[0]), Charset.forName("UTF-8"));
        
        List<String> lines = new ArrayList<>();
        lines.add("111111111111111111111111\n");
        lines.add("222222222222222222222222\n");
        lines.add("333333333333333333333333\n");
        
        String from = lines.get(0);
        String to = lines.get(1);
        String subject = lines.get(2);
        
        StringBuilder builder = new StringBuilder();
        for(int i = 3; i < lines.size(); i++){
            builder.append(lines.get(i));
            builder.append("\n");
        }
        
        
        
        Console console = System.console();
        //String password = new String(console.readPassword("Password: "));
        String password = "1234";
        
        Session mailSession = Session.getDefaultInstance(props);
        //mailSession.setDebug(true);
        
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(builder.toString());
        Transport tr = mailSession.getTransport();
        
        try{
            tr.connect(null, password);
            tr.sendMessage(message, message.getAllRecipients());
            
        }finally{
            tr.close();
        }
        
        
    }
    
}
