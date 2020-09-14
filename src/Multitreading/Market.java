package Multitreading;

public class Market {
	
	private int breadCount = 0;
	
	public synchronized void getBread() {
		while(breadCount < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		breadCount--;
		System.out.println("Customer bought one bread");
		System.out.println("Quantity of bread: "+ breadCount);
		notify();
	}
	
	public synchronized void putBread() {
		
		while(breadCount >= 5) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		breadCount++;
		System.out.println("Producer add one bread");
		System.out.println("Quantity of bread: "+ breadCount);
		notify();
	}

}
