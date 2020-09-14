package MultitrheadigCollections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.*;

public class ConcurentHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		//HashMap<Integer, String> map = new HashMap<>();
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Nick");
		map.put(2, "Victor");
		map.put(3, "Petr");
		map.put(4, "Olga");
		map.put(5, "Semen");
		System.out.println(map);
		
		Runnable runnable1 = () -> {
			
			Iterator<Integer> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Integer i = iterator.next();
				System.out.println(i + " : " + map.get(i));
			}
			
		};
		
		Runnable runnable2 = () -> {
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			map.put(6, "Elena");
			
		};
		
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		

		System.out.println(" map : " + map);
	}

}
