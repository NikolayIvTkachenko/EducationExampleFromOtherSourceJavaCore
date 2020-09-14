package collection;

import java.util.Vector;

public class VectorEx1 {
	
	public static void main(String[] args) {
		
		//add get remove firstElement lasElement
		Vector<String> vector = new Vector<>();
		vector.add("Nick");
		vector.add("Ivan");
		vector.add("Maria");
		vector.add("Elena");
		
		System.out.println("vector = " + vector);
		System.out.println("vector.firstElement() = " + vector.firstElement());
		System.out.println("vector.lastElement() = " + vector.lastElement());
		
		vector.remove(2);
		System.out.println("vector = " + vector);
		System.out.println("vector.get(1) = " + vector.get(1));
		
		
	}

}
