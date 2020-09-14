/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.ContentHandler;
import jdk.internal.org.xml.sax.DTDHandler;
import jdk.internal.org.xml.sax.EntityResolver;
import jdk.internal.org.xml.sax.ErrorHandler;
import jdk.internal.org.xml.sax.InputSource;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.SAXNotRecognizedException;
import jdk.internal.org.xml.sax.SAXNotSupportedException;
import jdk.internal.org.xml.sax.XMLReader;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;

/**
 *
 * @author tkach
 */
public class EmployeeReader implements XMLReader{

    private ContentHandler handler;
    
    public void parse(InputSource source) throws IOException, SAXException{
        InputStream stream = source.getByteStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        String rootElement = "staff";
        AttributesImpl atts = new AttributesImpl();
        if(handler == null) throw new SAXException("No content handler");
        
        handler.startDocument();
        handler.startElement("", rootElement, rootElement, (Attributes) atts);
        String line;
        
        while((line = in.readLine())!=null){
            
            handler.startElement("", "employee", "employee", (Attributes) atts);
            StringTokenizer t = new StringTokenizer(line, "|");
            
            handler.startElement("", "name", "name", (Attributes) atts);
            String s = t.nextToken();
            handler.characters(s.toCharArray(), 0, s.length());
            handler.endElement("", "name", "name");
            
            handler.startElement("", "salary", "salary", (Attributes) atts);
            s = t.nextToken();
            handler.characters(s.toCharArray(), 0, s.length());
            handler.endElement("", "salary", "salary");
            
            atts.addAttribute("", "year", "year", "CDATA", t.nextToken());
            atts.addAttribute("", "month", "month", "CDATA", t.nextToken());
            atts.addAttribute("", "day", "day", "CDATA", t.nextToken());
            handler.startElement("", "hiredate", "hiredate", (Attributes) atts);
            handler.endElement("", "hiredate", "hiredate");
            atts.clear();
        }
        handler.endElement("", rootElement, rootElement);
        handler.endDocument();
    }
    
    
    @Override
    public boolean getFeature(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        return false;
    }

    @Override
    public void setFeature(String string, boolean bln) throws SAXNotRecognizedException, SAXNotSupportedException {
        
    }

    @Override
    public Object getProperty(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        return null;
    }

    @Override
    public void setProperty(String string, Object o) throws SAXNotRecognizedException, SAXNotSupportedException {
        
    }

    @Override
    public void setEntityResolver(EntityResolver er) {
        
    }

    @Override
    public EntityResolver getEntityResolver() {
        return null;
    }

    @Override
    public void setDTDHandler(DTDHandler dtdh) {
        
    }

    @Override
    public DTDHandler getDTDHandler() {
        return null;
    }

    @Override
    public void setContentHandler(ContentHandler ch) {
        handler = ch;
    }

    @Override
    public ContentHandler getContentHandler() {
        return handler;
    }

    @Override
    public void setErrorHandler(ErrorHandler eh) {
        
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return null;
    }

    @Override
    public void parse(String string) throws IOException, SAXException {
        
    }
    
}
