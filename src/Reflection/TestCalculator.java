package Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {

	public static void main(String[] args) {
		
		//Файл должен в корне проекта находиться
		
		try(BufferedReader reader = new BufferedReader(new FileReader("Test100.txt"))){
			
			String methodName = reader.readLine();
			String firstArgument = reader.readLine();
			String secondArgument = reader.readLine();
			
			Calculator calculator = new Calculator();
			Class cl = calculator.getClass();
			Method method = null;
			Method[] methods = cl.getDeclaredMethods();
			
			for(Method m : methods) {
				if(m.getName().equals(methodName)) {
					method = m;
					break;
				}
			}
			
			method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
