package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.lang.reflect.InvocationTargetException;;

public class Ex02 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	
		Class employeeClass = Class.forName("Reflection.Employee");
		
		//Object o = employeeClass.newInstance();
		//Employee e = (Employee)employeeClass.newInstance();
		
		//System.out.println(e);
		
		Constructor constructor1 = employeeClass.getConstructor();
		Object obj1 = constructor1.newInstance();
		
		Constructor<Employee> constructor2 = employeeClass.getConstructor();
		Employee obj2 = constructor2.newInstance();
		
		Constructor constructor3 = employeeClass.getConstructor(int.class, String.class, String.class);
		Object obj3 = constructor3.newInstance(5, "Nick", "IT");
		System.out.println(obj3);
		
		
		Method method = employeeClass.getMethod("setSalary", double.class);
		method.invoke(obj3, 40.5);
		System.out.println(obj3);
		
		
		
		
	}

}
