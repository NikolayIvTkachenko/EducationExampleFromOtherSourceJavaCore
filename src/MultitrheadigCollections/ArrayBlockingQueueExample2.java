package MultitrheadigCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample2 {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); //size queue = 4
		
		
		//producer
		new Thread(() ->  {
			
			int i = 0;
			while (true) {
				
				try {
					queue.put(++i);
					System.out.println("Producer add : " + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		//Consume
		new Thread(() ->  {
			while (true) {
				
				try {
					Integer j = queue.take();
					System.out.println("Consumer take : " + j);
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
		System.out.println(queue);

		System.out.println(queue.remainingCapacity());

	}

}
