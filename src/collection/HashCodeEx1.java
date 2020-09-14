package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeEx1 {
	
	public static void main(String[] args) {
		
		Map<StudentV2, Double> map1 = new HashMap<>();
		
		StudentV2 st1 = new StudentV2("Nick", "Petrov", 5);
		StudentV2 st2 = new StudentV2("Vasyas", "Zayzev", 3);
		StudentV2 st3 = new StudentV2("Marian", "Borisov", 4);
		
		map1.put(st1, 7.7);
		map1.put(st2, 8.2);
		map1.put(st3, 9.7);
		
		System.out.println("map1: " + map1);
		
		StudentV2 st4 = new StudentV2("Nick", "Petrov", 5);
		boolean result = map1.containsKey(st4);
		System.out.println("result: " + result);
		
		System.out.println("st4.hashCode(): " + st4.hashCode());
		System.out.println("st1.hashCode(): " + st1.hashCode());
		
		for(Entry<StudentV2, Double> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		Map<Integer,String> map2 = new HashMap<>(16, 0.75f);
		
		
	}

}
