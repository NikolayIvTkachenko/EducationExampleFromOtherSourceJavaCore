package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("OK");
		list.add(5);
		list.add(new StringBuilder("hello"));
		list.add(new Car());
		
		List<String> list1 = new ArrayList<>();
		//TypeSafe
		
		
	}

}

class Car {
	
}