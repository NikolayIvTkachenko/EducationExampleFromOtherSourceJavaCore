package Multitreading;

public class Example11 {
	
	static int counter = 0;
	
	//volatile static int counter = 0; //not working
	
	
	//working
	public static synchronized void increment() {
		counter++;
	}
	
	//working
	public static void increment2() {
		
		synchronized (Example11.class) {
			counter++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		

		Thread thread1 = new Thread(new RunClass());
		Thread thread2 = new Thread(new RunClass());
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Work main ends");
		System.out.println("counter = " + counter);
	}

}
