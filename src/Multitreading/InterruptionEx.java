package Multitreading;

public class InterruptionEx {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Method main begins");
		
		InterruptedThread thread = new InterruptedThread();
		thread.start();
		
		Thread.sleep(500);
		
		thread.interrupt();
		thread.join();
		
		System.out.println("Method main ends");
	}

}
