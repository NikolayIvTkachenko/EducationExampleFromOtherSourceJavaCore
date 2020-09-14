package Reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.*;

public class Calculator {
	
	void sum(int a, int b) {
		int result = a + b;
		System.out.println("Sum " + a + " and " + b + " = " + result);
	}
	
	void subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Sub " + a + " and " + b + " = " + result);
	}
	
	void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Mult " + a + " and " + b + " = " + result);
	}
	
	void division(int a, int b) {
		int result = a / b;
		System.out.println("Div " + a + " and " + b + " = " + result);
	}
	
}



