package collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx1 {
	
	public static void main(String[] args) {
		
		//хранит порядок добавления или использования элементов
		
		LinkedHashMap<Double, StudentV2> linked = new LinkedHashMap<>(16, 0.75f, false);
		
		//false - порядок добавленя элементов
		//true - порядок использования элеиентов
		
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
		
		linked.put(5.8, st1);
		linked.put(6.4, st2);
		linked.put(7.2, st3);
		linked.put(7.5, st4);
		linked.put(7.9, st5);
		linked.put(8.2, st6);

		System.out.println("linked: " + linked);
		
	}

}
