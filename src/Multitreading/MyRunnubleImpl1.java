package Multitreading;

public class MyRunnubleImpl1 implements Runnable{

	public synchronized void increment() {
		Counter.count++;
		System.out.print(Counter.count + " ");
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i<3; i++) {
			increment();
		}
		
	}

}
