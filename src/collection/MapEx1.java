package collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1000, "Nick Nickov");
		map1.put(1440, "Petr Nickov");
		map1.put(1395, "Maria Nickov");
		map1.put(387, "Vasya Nickov");
		map1.put(3872, "Vasya Nickov");
		map1.putIfAbsent(1440, "Oleg Ivanov"); //Добавь если нет
		map1.put(null, "Sergey Petrov");
		map1.put(4356, null);
		
		System.out.println("map1: " + map1);
		
		System.out.println("map1.get(1000): " + map1.get(1000));
		map1.remove(387);
		System.out.println("map1: " + map1);
		
		System.out.println("contains value: " + map1.containsValue("Maria Nickov"));
		System.out.println("contains key: " + map1.containsKey(1440));
		
		System.out.println("keySet: " + map1.keySet());
		System.out.println("keySet: " + map1.values());
		
		//entrySet
		
		
		//equals
		//hashcode
		
		
	}

}
