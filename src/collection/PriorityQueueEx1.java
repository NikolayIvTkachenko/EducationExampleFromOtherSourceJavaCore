package collection;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(4);
		priorityQueue.add(1);
		priorityQueue.add(7);
		priorityQueue.add(10);
		priorityQueue.add(8);
		priorityQueue.add(9);
		//1 4 7 8 9 10 -> приоритет от наименьшего в наибольший? первый уходит наитменьший
		
		System.out.println("priorityQueue: " + priorityQueue);
		System.out.println("priorityQueue.peek: " + priorityQueue.peek());
		
		
		
		StudentV3 st1 = new StudentV3("Nick", 5);
		StudentV3 st2 = new StudentV3("Vasyas", 3);
		StudentV3 st3 = new StudentV3("Marian", 4);
		StudentV3 st4 = new StudentV3("Nickolya", 2);
		StudentV3 st5 = new StudentV3("Vita", 3);
		
		
		PriorityQueue<StudentV3> students = new PriorityQueue<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		System.out.println("students: " + students);
		System.out.println("students.poll: " + students.poll());
		System.out.println("students.poll: " + students.poll());
		System.out.println("students.poll: " + students.poll());
		System.out.println("students.poll: " + students.poll());
		System.out.println("students.poll: " + students.poll());
		
		
	}

}
