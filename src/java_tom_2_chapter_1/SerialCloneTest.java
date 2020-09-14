/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

/**
 *
 * @author tkach
 */
public class SerialCloneTest {
    public static void main(String[] args){
        
        Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1);
        
        Employee harry2 = (Employee) harry.clone();
        
        harry.raiseSalary(10);
        
        System.out.println(harry);
        System.out.println(harry2);
        
    }
}
