package Multitreading;

public class Example09 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Method main begins");
		Thread thread = new Thread(new Worker());
		
		System.out.println(thread.getState());
		
		thread.start();
		System.out.println(thread.getState());
		//thread.join(1500); //main thread wait 1500 or end thread
		thread.join();
		System.out.println(thread.getState());
		
		System.out.println("Work main ends");
		

	}

	
	//thrtead states
	//new -> runnable -> terminated
	//runnable -> ready
	//  	   -> running
		
	
	
	
}
