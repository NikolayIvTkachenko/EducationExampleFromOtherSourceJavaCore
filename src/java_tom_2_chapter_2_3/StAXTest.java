/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_3;

import java.io.InputStream;
import java.net.URL;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author tkach
 */
public class StAXTest {
    public static void main(String[] args) throws Exception{
        String urlString;
        if(args.length ==0){
            urlString = "http://www.w3c.org";
            System.out.println("Using "+urlString);
        }else urlString = args[0];
        
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(in);
        
        while(parser.hasNext()){
            int event = parser.next();
            if(event == XMLStreamConstants.START_ELEMENT){
                if(parser.getLocalName().equals("a")){
                    String href = parser.getAttributeValue(null, "href");
                    if(href != null)
                        System.out.println(href);
                }
            }
        }
    }
}
