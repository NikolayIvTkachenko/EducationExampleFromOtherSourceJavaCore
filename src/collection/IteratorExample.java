package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Nick");
		list1.add("Ivan");
		list1.add("Maria");
		list1.add("Elena");
		
		Iterator<String> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.next();
			iterator.remove();
		}
		System.out.println(list1);
		
	}

}
