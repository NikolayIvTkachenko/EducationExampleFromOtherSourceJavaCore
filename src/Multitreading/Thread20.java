package Multitreading;

public class Thread20 extends Thread{
	
//	public void run() {
//		System.out.println("Thread20: try catch monitor object lock 2");
//		synchronized(DeadLockExample.lock2) {
//			System.out.println("Thread20: monitor object lock 2 is occupaed");
//			
//			System.out.println("Thread20: try catch monitor object lock 1");
//			synchronized(DeadLockExample.lock1) {
//				System.out.println("Thread20: monitors objects lock1 and lock2 is occupaed");
//				
//				
//			}
//			
//		}
//		
//	}
	
	
	//Never be deadlock
	public void run() {
		System.out.println("Thread20: try catch monitor object lock 1");
		synchronized(DeadLockExample.lock1) {
			System.out.println("Thread20: monitor object lock 1 is occupaed");
			
			System.out.println("Thread20: try catch monitor object lock 2");
			synchronized(DeadLockExample.lock2) {
				System.out.println("Thread20: monitors objects lock1 and lock2 is occupaed");
				
				
			}
			
		}
		
	}

}
