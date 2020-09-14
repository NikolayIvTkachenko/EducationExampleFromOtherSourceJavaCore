package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.util.Arrays;


public class Ex01 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		//Variant 1
		Class employeeClass = Class.forName("Reflection.Employee");
		
		//Variant 2
		//Class employeeClass2 = Employee.class;
		
		//Variant 3
		//Employee employee = new Employee();
		//Class employeeClass3 = employee.getClass();
		
		
		Field someField = employeeClass.getField("id");
		System.out.println("Type of id field = " + someField.getType());
		
		System.out.println(" *** ");
		
		Field[] fields = employeeClass.getFields();
		for(Field field : fields) {
			System.out.println("Type of " + someField.getName() + " = " + field.getType());
		}
		
		System.out.println(" *** ");
		
		Field[] fieldsAll = employeeClass.getDeclaredFields();
		for(Field field : fieldsAll) {
			System.out.println("Type of " + someField.getName() + " = " + field.getType());
		}
		
		System.out.println(" -------------------- ");
		
		Method someMethod1 =  employeeClass.getMethod("increaseSalary");
		System.out.println("Return type of method increaseSalary =  " + someMethod1.getReturnType() + 
				", parameters types = " + Arrays.toString(someMethod1.getParameterTypes()));
		
		System.out.println(" *** ");
		
		Method someMethod2 =  employeeClass.getMethod("setSalary", double.class);
		System.out.println("Return type of method setSalary =  " + someMethod2.getReturnType() + 
				", parameters types = " + Arrays.toString(someMethod2.getParameterTypes()));
		
		System.out.println(" *** ");
		
		Method[] methods =  employeeClass.getMethods();
		for(Method method : methods) {
			System.out.println("Name of method = " + method.getName() + 
					", return type " + method.getReturnType() +
					", parameter types = " + Arrays.toString(method.getParameterTypes()));
		}
		
		System.out.println(" *** ");
		
		Method[] methodsAll =  employeeClass.getDeclaredMethods();
		for(Method method : methodsAll) {
			System.out.println("Name of method = " + method.getName() + 
					", return type " + method.getReturnType() +
					", parameter types = " + Arrays.toString(method.getParameterTypes()));
		}
		
		System.out.println(" *** ");
		
		Method[] methodsAll2 =  employeeClass.getDeclaredMethods();
		
		for(Method method : methodsAll2) {
			if(Modifier.isPublic(method.getModifiers())) {
			System.out.println("Name of method = " + method.getName() + 
					", return type " + method.getReturnType() +
					", parameter types = " + Arrays.toString(method.getParameterTypes()));
			}
		}
		
		System.out.println(" ------------------- ");
		
		Constructor constructor1 = employeeClass.getConstructor();
		System.out.println(" Constructor has  " + constructor1.getParameterCount() +
				" parameters,  their types are: " + Arrays.toString(constructor1.getParameterTypes())
				);
		
		System.out.println(" *** ");
		
		Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
		System.out.println(" Constructor has  " + constructor2.getParameterCount() +
				" parameters,  their types are: " + Arrays.toString(constructor2.getParameterTypes())
				);
		
		System.out.println(" *** ");
		
		Constructor[] constructors = employeeClass.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println("Name of constructor = " + constructor.getName() + 
					" Constructor has  "  + constructor.getParameterCount() +
					" parameters,  their types are: " + Arrays.toString(constructor.getParameterTypes()));
		}
		
		System.out.println(" *** ");
		
		Constructor[] constructorsAll = employeeClass.getDeclaredConstructors();
		for(Constructor constructor : constructorsAll) {
			System.out.println("Name of constructor = " + constructor.getName() + 
					" Constructor has  "  + constructor.getParameterCount() +
					" parameters,  their types are: " + Arrays.toString(constructor.getParameterTypes()));
		}
		
		
	}

}
