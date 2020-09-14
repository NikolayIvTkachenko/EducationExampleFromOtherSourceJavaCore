/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_5;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/**
 *
 * @author tkach
 */
public class TransformTest {
    public static void main(String[] args) throws Exception{
        
        Path path;
        if(args.length > 0) path = Paths.get(args[0]);
        else path = Paths.get("transform", "makehtml.xsl");
        
        try(InputStream styleIn = Files.newInputStream(path)){
            StreamSource styleSource = new StreamSource(styleIn);
            
            Transformer t =
                    TransformerFactory.newInstance().newTransformer(styleSource);
            
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.setOutputProperty(OutputKeys.METHOD, "xml");
            t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            
            try(InputStream docIn = Files.newInputStream(Paths.get("transform", "employee.dat"))){
                t.transform(new SAXSource((XMLReader) new EmployeeReader(), new InputSource(docIn)), new StreamResult(System.out));
            }
        }
        
    }
}
