package Generics;

import java.util.ArrayList;

public class GenMethod {

	public static <T> T getSecondElement(ArrayList<T> a1) {
		return a1.get(1);
	}
	
	public static <T extends Number> T getSecondElementМ2(ArrayList<T> a1) {
		return a1.get(1);
	}
	
}
