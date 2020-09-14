package Multitreading;

public class SynchronizedBlock1 {

	public static void main(String[] args) {
		
		
		MyRunnubleImpl2 runnable = new MyRunnubleImpl2();
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		

		thread1.start();
		thread2.start();
		thread3.start();
		
		

	}

}
