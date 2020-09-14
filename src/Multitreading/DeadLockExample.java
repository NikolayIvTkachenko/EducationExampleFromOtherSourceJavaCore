package Multitreading;

public class DeadLockExample {
	
	
	public static final Object lock1 = new Object();
	public static final Object lock2 = new Object();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Thread10
		//Thread20
		Thread10 thread10 = new Thread10();
		Thread20 thread20 = new Thread20();
		
		
		thread10.start();
		thread20.start();
		
		
	}

}
