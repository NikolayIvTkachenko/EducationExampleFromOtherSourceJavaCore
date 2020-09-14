/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tkach
 */
public class ObjectStreamTest {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee harry = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        carl.setSecreter(harry);
        
        Manager tony = new Manager("Tony Tester", 40000, 1990, 3, 15);
        tony.setSecreter(harry);
        
        
        Employee[] staff = new Employee[3];
        staff[0] = carl;
        staff[1] = harry;
        staff[2] = tony;
        
        //save rocords about all employees to file employees2.dat
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees2.dat"))){
            out.writeObject(staff);
        }
        
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees2.dat"))){
            //get all records to new array
            Employee[] newStaff = (Employee[])in.readObject();
            
            //the salary of secretary get up
            newStaff[1].raiseSalary(10);
            
            //get new record about employee
            for(Employee e : newStaff){
                System.out.println(e);
            }
            
        }
        
    }
    
}
