/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author tkach
 */
public class Employee extends SerialCloneable{
    private String name;
    private double salary;
    private Date hireDay;
    
    
    public static int RECORD_SIZE = 100;
    public static int NAME_SIZE = 40;
    
    public Employee(){}
    
    public Employee(String n, double s, int year, int month, int day){
        
        name = n;
        salary = s;
        GregorianCalendar calendar =
                new GregorianCalendar(year, month-1, day);
        hireDay = calendar.getTime();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + '}';
    }
    
    
    
    
}
