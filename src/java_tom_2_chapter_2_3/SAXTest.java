/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_3;

import java.io.*;
import java.net.*;
import javax.xml.parsers.*;

import org.xml.sax.helpers.DefaultHandler;

import jdk.internal.org.xml.sax.*;
import jdk.internal.org.xml.sax.helpers.*;

/**
 *
 * @author tkach
 */
public class SAXTest {
    public static void main(String[] args) throws Exception{
        String url;
        if(args.length == 0){
            url = "http://www.w3c.org";
            System.out.println("Using "+url);
        }else{
            url = args[0];
        }
        
        DefaultHandler handler = new DefaultHandler(){
            @Override
            public void startElement(String namespaceURI, String lname, String gname, Attributes attrs) throws SAXException {
                if(lname.equals("a") && attrs != null){
                    for(int i = 0; i < attrs.getLength();i++){
                        String aname  = attrs.getLocalName(i);
                        if(aname.equals("href"))
                            System.out.println(attrs.getValue(i));
                    }
                }
            }
        };
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        SAXParser saxParser = factory.newSAXParser();
        InputStream in = new URL(url).openStream();
    
        //saxParser.parse(in, handler);
        //saxParser.parse(in, handler);
    }
}
