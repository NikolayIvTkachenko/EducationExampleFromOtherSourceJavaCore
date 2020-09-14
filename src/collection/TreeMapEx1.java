package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		
		TreeMap<Double, StudentV2> treeMap = new TreeMap<>();
		StudentV2 st1 = new StudentV2("Nick", "Petrov", 5);
		StudentV2 st2 = new StudentV2("Vasyas", "Zayzev", 3);
		StudentV2 st3 = new StudentV2("Marian", "Borisov", 4);
		StudentV2 st4 = new StudentV2("Nickolya", "Baskov", 2);
		StudentV2 st5 = new StudentV2("Vita", "Morozova", 3);
		StudentV2 st6 = new StudentV2("Ariy", "Nato", 1);
		StudentV2 st7 = new StudentV2("Jhon", "Aley", 2);
		StudentV2 st8 = new StudentV2("Vitas", "Kuzmin", 5);
		StudentV2 st9 = new StudentV2("Ange", "Vetrov", 4);
		
		
		StudentV2 st10 = new StudentV2("Ange", "Vetrov", 4);
		StudentV2 st11 = new StudentV2("Petr", "Sidorov", 2);
		
		treeMap.put(5.8, st1);
		treeMap.put(6.4, st2);
		treeMap.put(7.2, st3);
		treeMap.put(7.5, st4);
		treeMap.put(7.9, st5);
		treeMap.put(8.2, st6);
		treeMap.put(9.1, st7);
		treeMap.put(3.8, st8);
		treeMap.put(3.4, st9);
		treeMap.put(3.2, st10);
		//treeMap.put(9.1, st11);
		
		System.out.println("treeMap: " + treeMap);
		System.out.println("treeMap.get(9.1): " + treeMap.get(9.1));
		treeMap.remove(3.2);
		System.out.println("treeMap: " + treeMap);
		
		//desendigMap
		System.out.println("treeMap.descendingMap() : " + treeMap.descendingMap());
		
		//tailMap
		System.out.println("treeMap.tailMap() : " + treeMap.tailMap(7.2));
		
		//headMap
		System.out.println("treeMap.tailMap() : " + treeMap.headMap(5.8));
		
		//LasrEntry
		System.out.println("treeMap.lastEntry() : " + treeMap.lastEntry());

		//FirstEntry
		System.out.println("treeMap.firstEntry() : " + treeMap.firstEntry());
		
		TreeMap<StudentV2, Double> treeMap2 = new TreeMap<>();
		treeMap2.put(st1, 5.8);
		treeMap2.put(st2, 6.4);
		treeMap2.put(st3, 7.2);
		treeMap2.put(st4, 7.5);
		treeMap2.put(st5, 7.9);
		treeMap2.put(st6, 8.2);
		treeMap2.put(st7, 9.1);
		treeMap2.put(st8, 3.8);
		treeMap2.put(st9, 3.4);
		treeMap2.put(st10, 3.2);
		System.out.println("treeMap2: " + treeMap2);
		
		
		TreeMap<StudentV2, Double> treeMap3 = new TreeMap<>(new Comparator<StudentV2>(){
			@Override
			public int compare(StudentV2 o1, StudentV2 o2) {
				
				
				
				return 0;
			}});
		
		System.out.println("treeMap2.containsKey: " + treeMap2.containsKey(st8));
		
		
		
		
	}
}





