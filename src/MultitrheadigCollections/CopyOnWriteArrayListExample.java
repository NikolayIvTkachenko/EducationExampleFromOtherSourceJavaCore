package MultitrheadigCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//ArrayList<String> list = new ArrayList<>();
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		//CopyOnWriteArraySet
		
		list.add("Ivan");
		list.add("Oleg");
		list.add("Igor");
		list.add("Sergey");
		list.add("Vasya");
		
		System.out.println(list);
		
		Runnable runnable1 = () -> {
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				String str = iterator.next();
				System.out.println("str : " + str);
			}
		};
		
		Runnable runnable2 = () -> {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list.remove(4);
			list.add("Elena");
			
			System.out.println("list : " + list);
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		

		System.out.println("list : " + list);

	}

}
