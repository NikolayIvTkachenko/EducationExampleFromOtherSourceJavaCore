package Multitreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main starts");
		
		//ExecutorService executorService = Executors.newFixedThreadPool(5);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		for(int i=0; i < 10; i++) {
			executorService.execute(new RunnableImpl100());
		}
		
		executorService.shutdown();
		//executorService.awaitTermination(5, TimeUnit.SECONDS); //work like join
		
		System.out.println("executorService.isShutdown = " + executorService.isShutdown());
		System.out.println("main ends");
		

	}

}
