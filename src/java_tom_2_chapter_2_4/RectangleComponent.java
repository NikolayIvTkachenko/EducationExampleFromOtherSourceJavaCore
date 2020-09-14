/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_2_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComponent;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author tkach
 */
public class RectangleComponent extends JComponent{
    
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;  
    
    private List<Rectangle2D> rects;
    private List<Color> colors;
    private Random generator;
    private DocumentBuilder builder;
    
    public RectangleComponent(){
        rects = new ArrayList<>();
        colors = new ArrayList<>();
        generator = new Random();
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        
        try{
            builder = factory.newDocumentBuilder();
        }catch(ParserConfigurationException e){
            e.printStackTrace();
        }    
    }
    
    public void newDrawing(){
        int n = 10 + generator.nextInt(20);
        rects.clear();
        colors.clear();
        
        for(int i = 1; i <=n; i++){
            int x = generator.nextInt(getWidth());
            int y = generator.nextInt(getHeight());
            int width = generator.nextInt(getWidth()-x);
            int height = generator.nextInt(getHeight()-y);
            rects.add(new Rectangle(x, y, width, height));
            int r = generator.nextInt(256);
            int g = generator.nextInt(256);
            int b = generator.nextInt(256);
            colors.add(new Color(r, g, b));
        }
        repaint();
    }
    
    public void paintComponent(Graphics g){
        if(rects.size() == 0)newDrawing();
        Graphics2D g2 = (Graphics2D)g;
        
        //draw all rectangles
        for(int i = 0; i < rects.size(); i++){
            g2.setPaint(colors.get(i));
            g2.fill(rects.get(i));
        }
    }
    
    public Document buildDocument(){
        String namespace = "http://www.w3.org/2000/svg";
        Document doc = builder.newDocument();
        Element svgElement = doc.createElementNS(namespace, "svg");
        doc.appendChild(svgElement);
        svgElement.setAttribute("width", ""+getWidth());
        svgElement.setAttribute("height", ""+getHeight());
        
        for(int i = 0; i < rects.size(); i++){
            Color c = colors.get(i);
            Rectangle2D r = rects.get(i);
            Element rectElement = doc.createElementNS(namespace, "rect");
            
            rectElement.setAttribute("x", ""+r.getX());
            rectElement.setAttribute("y", ""+r.getY());
            
            rectElement.setAttribute("width", ""+r.getWidth());
            rectElement.setAttribute("height", ""+r.getHeight());
            
            rectElement.setAttribute("fill", colorToString(c));
            rectElement.appendChild(rectElement);
        }
        return doc;
    }
    
    public void writeDocument(XMLStreamWriter writer) throws XMLStreamException{
        String TEXT_TOOL = "<!DOCTYPE svg PUBLIC \"-//W#C//DTD SVG 2000802//EN\" "+
                "\"http://www.w3.org/TR/2000/CR-SVG-2000802/DTD/svg-2000802.dtd\">";
        writer.writeStartDocument();
        writer.writeDTD(TEXT_TOOL);
        
        writer.writeStartElement("svg");
        writer.writeDefaultNamespace("http://www.w3.org/2000/svg");
        writer.writeAttribute("width", ""+getWidth());
        writer.writeAttribute("height", ""+getHeight());
        
        for(int i = 0; i < rects.size(); i++){
            Color c = colors.get(i);
            Rectangle2D r = rects.get(i);
            writer.writeEmptyElement("rect");
            writer.writeAttribute("x", ""+r.getX());
            writer.writeAttribute("y", ""+r.getY());
            writer.writeAttribute("width", ""+r.getWidth());
            writer.writeAttribute("height", ""+r.getHeight());
            writer.writeAttribute("fill", colorToString(c));
        }
        writer.writeEndDocument();
    }
    
    private static String colorToString(Color c){
        StringBuffer buffer = new StringBuffer();
        buffer.append(Integer.toHexString(c.getRGB() & 0xFFFFFF));
        while(buffer.length()<6){
            buffer.insert(0, '0');
        }
        buffer.insert(0,'#');
        return buffer.toString();
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
