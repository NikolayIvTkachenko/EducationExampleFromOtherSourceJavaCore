package Multitreading;

public class VolataleExample extends Thread{
	
	
	volatile boolean b = true;
	
	public void run() {
		System.out.println("start run");
		long counter = 0;
		while(b) {
			counter++;
		}
		System.out.println("Loop is finished. counter = " + counter);
	}

	public static void main(String[] args) throws InterruptedException {
		
		VolataleExample thread = new VolataleExample();
		
		thread.start();
		Thread.sleep(3000);
		
		System.out.println("After 3 seconds it is time to wake up!");
		thread.b = false;
		thread.join();
		
		
		System.out.println("End");
		

	}

}
