/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_9_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author tkach
 */
public class CryptoClassLoader extends ClassLoader{
    
    private int key;
    
    public CryptoClassLoader(int k){
        key = k;
    }
    
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        try{
            
            byte[] classBytes = null;
            classBytes = loadClassBytes(name);
            Class<?> cl = defineClass(name, classBytes, 0, classBytes.length);
            if(cl == null) throw new ClassNotFoundException(name);
            return cl;
            
        }catch(IOException e){
            throw new ClassNotFoundException(name);
        }
    }
    
    private byte[] loadClassBytes(String name) throws IOException{
        String cname = name.replace('.', '/')+".ceasar";
        byte[] bytes = Files.readAllBytes(Paths.get(cname));
        for(int i = 0; i < bytes.length; i++){
            bytes[i] = (byte)(bytes[i]-key);
        }
        
        return bytes;
    }
    
}
