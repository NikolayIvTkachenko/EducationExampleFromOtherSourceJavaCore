package Multitreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	
	static CountDownLatch countDownLatch = new CountDownLatch(3);
	
	private static void marketStaffOnPlace() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Market staff came to work");
		countDownLatch.countDown();
		System.out.println("countDownLatch = " + countDownLatch.getCount());
	}
	
	private static void everyThingIsReady() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("EveryThing is ready for market");
		countDownLatch.countDown();
		System.out.println("countDownLatch = " + countDownLatch.getCount());
	}
	
	private static void openMarket() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Market is Open");
		countDownLatch.countDown();
		System.out.println("countDownLatch = " + countDownLatch.getCount());
	}

	public static void main(String[] args) throws InterruptedException {
		
		new Freind("Oleg", countDownLatch );
		new Freind("Nick", countDownLatch );
		new Freind("Michle", countDownLatch );
		new Freind("Marina", countDownLatch );
		new Freind("Irina", countDownLatch );
		
		marketStaffOnPlace();
		everyThingIsReady();
		openMarket();

	}

}
