/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.io.*;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author tkach
 */
public class RandomAccessTest {
    public static void main(String[] args) throws IOException{
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 1, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("employee.dat"))){
            //save all records about employees to file employee.dat
            for(Employee e: staff){
                writeData(out, e);
            }
        }
        
        try(RandomAccessFile in = new RandomAccessFile("employee.dat", "r")){
            int n = (int)(in.length()/Employee.RECORD_SIZE);
            Employee[] newStaff = new Employee[n];
            
            //read records about employees in back order
            for(int i = n-1; i>=0;i--){
                newStaff[i] = new Employee();
                in.seek(i*Employee.RECORD_SIZE);
                newStaff[i] = readData(in);
            }
            
            //output just now records have beeb read about employees
            for(Employee e : newStaff){
                System.out.println(e);
            }
        }
    }
    
    public static void writeData(DataOutput out, Employee e) throws IOException{
        DataIO.writeFixedString(e.getName(), Employee.NAME_SIZE, out);
        out.writeDouble(e.getSalary());
        
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(e.getHireDay());
        out.writeInt(calendar.get(Calendar.YEAR));
        out.writeInt(calendar.get(Calendar.MONTH)+1);
        out.writeInt(calendar.get(Calendar.DAY_OF_MONTH));
        
    }
            
    public static Employee readData(DataInput in) throws IOException{
        String name = DataIO.readFixedString(Employee.NAME_SIZE, in);
        double salary = in.readDouble();
        int y = in.readInt();
        int m = in.readInt();
        int d = in.readInt();
        return new Employee(name, salary, y, m-1, d);
    }
    
}
