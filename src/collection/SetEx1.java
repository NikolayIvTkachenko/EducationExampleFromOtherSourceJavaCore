package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		
		
		Set<String> set01 = new HashSet<>(); //use inside HashMap
		
		set01.add("Nick");
		set01.add("Marina");
		set01.add("Oleg");
		set01.add("Victor");
		set01.add(null);
		
		System.out.println("set01: " + set01);
		
		for (String s : set01) {
			System.out.println("s: " + s);
		}
		
		set01.remove("Oleg");
		System.out.println("set01: " + set01);
		System.out.println("set01.size: " + set01.size());

		System.out.println("set01.isEmpty: " + set01.isEmpty());
		System.out.println("set01.contains: " + set01.contains("Victor"));
		
		HashSet<Integer> set02 = new HashSet<>(); 
		set02.add(4);
		set02.add(5);
		set02.add(1);
		set02.add(8);
		
		HashSet<Integer> set03 = new HashSet<>(); 
		set03.add(9);
		set03.add(5);
		set03.add(2);
		set03.add(6);
		
		//set02.addAll(set03);
		System.out.println("set02: " + set02);
		HashSet<Integer> union = new HashSet<>(set02); 
		union.addAll(set03);
		System.out.println("union: " + union);
		
		HashSet<Integer> intersect = new HashSet<>(set02); 
		intersect.retainAll(set03);
		
		System.out.println("ntersect: " + intersect);
		
		
		HashSet<Integer> subtruct = new HashSet<>(set02); 
		subtruct.removeAll(set03);
		System.out.println("subtruct: " + subtruct);
	}

}
