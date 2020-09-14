package collection;

import java.util.LinkedList;

public class LinkedListEx1 {

	
	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", 3);
		Student st2 = new Student("Nikolay", 2);
		Student st3 = new Student("Elena", 1);
		Student st4 = new Student("Petr", 4);
		Student st5 = new Student("Maria", 3);
		
		LinkedList<Student> students = new LinkedList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		System.out.println("Linked List: " + students);
		System.out.println(students.get(2));
		
		Student st6 = new Student("Igor", 4);
		Student st7 = new Student("Kolya", 3);
		students.add(st6);
		students.add(1, st7);
		System.out.println("Linked List: " + students);
		students.remove(3);
		System.out.println("Linked List: " + students);
		
		
	}
	
}
