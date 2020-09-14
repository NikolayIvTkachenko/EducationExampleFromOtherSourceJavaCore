package Multitreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	
	//static int counyter = 0;
	static AtomicInteger counter = new AtomicInteger(0);
	
	//public synchronized static void increment() {
	public static void increment() {
		//counyter++;
		counter.incrementAndGet();
		counter.addAndGet(5);
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new MyRunnableIml18());
		Thread thread2 = new Thread(new MyRunnableIml18());
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println("counyter = " + counter);

	}

}
