package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx1 {
	
	public static void main(String[] args) {
		//Polidrom
		//madam
		
		String s = "madam";
		List<Character> list = new LinkedList<>();
		for(char ch : s.toCharArray()) {
			list.add(ch);
		}
		System.out.println("list: " + list);
		
		ListIterator<Character> iterator = list.listIterator();
		ListIterator<Character> reverseIterator = list.listIterator(list.size());
		
		boolean isPolidrom = true;
		while(iterator.hasNext() && reverseIterator.hasNext()) {
			if (iterator.next() != reverseIterator.previous()) {
				isPolidrom = false;
				break;
			}
		}
		
		if (isPolidrom) {
			System.out.println("Polidrom");
		}else{
			System.out.println("Not Polidrom");
		}
		
	}

}
