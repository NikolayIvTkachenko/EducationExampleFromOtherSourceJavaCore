package collection;

import java.util.Hashtable;

public class HashTableEx1 {

	public static void main(String[] args) {
		
		Hashtable<Double, StudentV2> table = new Hashtable<>(); 
		StudentV2 st1 = new StudentV2("Nick", "Petrov", 5);
		StudentV2 st2 = new StudentV2("Vasyas", "Zayzev", 3);
		StudentV2 st3 = new StudentV2("Marian", "Borisov", 4);
		StudentV2 st4 = new StudentV2("Nickolya", "Baskov", 2);
		
		table.put(5.8, st1);
		table.put(6.4, st2);
		table.put(7.2, st3);
		table.put(7.5, st4);
		
		System.out.println(table);
		

	}

}
