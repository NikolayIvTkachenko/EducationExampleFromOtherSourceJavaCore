package Generics;

import java.util.ArrayList;

public class ParameterizideMethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> all = new ArrayList<>();
		all.add(10);
		all.add(20);
		all.add(5);
		
		int g1 = GenMethod.getSecondElement(all);
		System.out.println(g1);
		
		ArrayList<String> all2 = new ArrayList<>();
		all2.add("10");
		all2.add("20");
		all2.add("5");
		
		String s1 = GenMethod.getSecondElement(all2);
		System.out.println(s1);
		
		//E - Element
		//K - Keys
		//V - Value
		//K, V -- Map <K, V>
		//T - TypePlaceholder
		
		//TYPE ERASURE
		//ArrayList all5 = new ArrayList();
		//int i = (Integer)all.get(0);  -- стирание типов
		
		
	}

}
