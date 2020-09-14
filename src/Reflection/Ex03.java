package Reflection;


import java.lang.reflect.*;

public class Ex03 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		
		//Class employeeClass = Class.forName("Reflection.EmployeeV2");
		
		EmployeeV2 employee = new EmployeeV2(10, "Nick", "IT");
		Class employeeClass = employee.getClass();
		Field field = employeeClass.getDeclaredField("salary");
		
		field.setAccessible(true);
		
		double salaryValue = (double) field.get(employee);
		System.out.println(salaryValue);
		
		field.set(employee, 2000.50);
		System.out.println(employee);
		
		
		
	}
}
