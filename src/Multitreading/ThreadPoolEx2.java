package Multitreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("main starts");
		
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
		
//		for(int i=0; i < 10; i++) {
//			executorService.execute(new RunnableImpl200());
//		}
		
		//executorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
		
		//Periodic start task
		//executorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
		
		
		
		executorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
		
		
		Thread.sleep(20000);
		executorService.shutdown();
		
		
		ExecutorService cachePool = Executors.newCachedThreadPool();
		
		
		//executorService.awaitTermination(5, TimeUnit.SECONDS); //work like join
		
		System.out.println("executorService.isShutdown = " + executorService.isShutdown());
		System.out.println("main ends");
		

	}

}
