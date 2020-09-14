/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_3_1;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author tkach
 */
public class InetAddressTest {
    public static void main(String[] args)throws IOException{
        if(args.length > 0){
            String host = args[0];
            InetAddress[] address = InetAddress.getAllByName(host);
            for(InetAddress a : address)
                System.out.println(a);
        }else{
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
        }
    }
}
