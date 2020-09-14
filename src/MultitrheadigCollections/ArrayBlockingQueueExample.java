package MultitrheadigCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); //size queue = 4
		
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println(queue);
		
		//queue.add(6);
		queue.offer(6);
		
		System.out.println(queue);

		System.out.println(queue.remainingCapacity());
		
	}

}
