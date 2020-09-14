 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author tkach
 */
public class RegexTest {
    
    public static void main(String[] args) throws PatternSyntaxException{
        
        //((1?[0-9]):([0-5][0-9]))[ap]m
        //11:59am
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pattern: ");
        String patternString = in.nextLine();
        
        Pattern pattern = Pattern.compile(patternString);
        
        while(true){
            System.out.println("Enter string to match: ");
            String input = in.nextLine();
            if(input == null || input.equals(""))return;
            Matcher matcher = pattern.matcher(input);
            
            if(matcher.matches()){
                System.out.println("Match");
                int g = matcher.groupCount();
                if(g > 0){
                    for(int i = 0; i < input.length(); i++){
                        
                        
                        //show any empty group
                        for(int j = 1; j <=g; j++)
                        if(i==matcher.start(j) && i==matcher.end(j))
                            System.out.println("()");
                        
                        //show "(" in the strt not null group
                        for(int j = 1; j <=g; j++)
                            if(i==matcher.start(j) && i != matcher.end(j))
                                System.out.println("(");
                    
                        System.out.println(input.charAt(i));
                     
                        for(int j = 1; j <=g; j++)
                            if(i+1 != matcher.start(j) && i+1 == matcher.end(j))
                                System.out.println(")"); 
                        }
                        System.out.println("");  
                }
                
            }else{
                System.out.println("No match");
            }
        }
    } 
}
