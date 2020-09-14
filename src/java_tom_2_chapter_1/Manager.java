/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tom_2_chapter_1;

import java.util.GregorianCalendar;

/**
 *
 * @author tkach
 */
public class Manager extends Employee{
    private Employee secreter;

    Manager(String n, int s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    public Employee getSecreter() {
        return secreter;
    }

    public void setSecreter(Employee secreter) {
        this.secreter = secreter;
    }
    
    
}
