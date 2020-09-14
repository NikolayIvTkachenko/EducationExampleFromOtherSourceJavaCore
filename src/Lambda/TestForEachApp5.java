package Lambda;

import java.util.ArrayList;
import java.util.List;

public class TestForEachApp5 {

	public static void main(String[] args) {
		
		List<String> list = List.of("Hello", "How are you?", "normal", "Bay");
		
		for(String s : list) {
			System.out.println("s: " + s);
		}
		
		System.out.println("=====");
		
		list.forEach(str -> {System.out.println("str: " + str);});
		
		System.out.println("=====");
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		list2.forEach(element -> {
			System.out.println("element: " + element);
			element *=2;
			System.out.println("element: " + element);
		});
		

	}

}
