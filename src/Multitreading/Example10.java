package Multitreading;

public class Example10 {

	public static void main(String[] args) {
		
		MyRunnubleImpl1 runnable = new MyRunnubleImpl1();
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		

		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
