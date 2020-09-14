package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		
		Queue<String> queue1 =  new LinkedList<>();
		queue1.add("Nick");
		queue1.add("Ivan");
		queue1.add("Maria");
		queue1.add("Elena");
		queue1.offer("Aleksandr");
		
		System.out.println("queue1: " + queue1);
		System.out.println("queue1.poll: " + queue1.poll());
		System.out.println("queue1: " + queue1);
		System.out.println("queue1.peek: " + queue1.peek());
		System.out.println("queue1: " + queue1);
		System.out.println("queue1.remove: " + queue1.remove());
		System.out.println("queue1: " + queue1);
		
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);
//		System.out.println("queue1.poll: " + queue1.poll());
//		System.out.println("queue1: " + queue1);

		
		System.out.println("queue1.element: " + queue1.element());
		System.out.println("queue1: " + queue1);
		
		System.out.println("queue1.remove: " + queue1.remove("Elena"));
		System.out.println("queue1: " + queue1);
		
	}

}
