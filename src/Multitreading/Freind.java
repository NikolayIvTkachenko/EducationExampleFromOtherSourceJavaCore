package Multitreading;

import java.util.concurrent.CountDownLatch;

public class Freind extends Thread{

	String name;
	
	private CountDownLatch countDownLatch;
	
	public Freind(String name, CountDownLatch countDownLatch) {
		this.name = name;
		this.countDownLatch = countDownLatch;
		this.start();
	}
	
	
	public void run() {
		try {
			countDownLatch.await();
			System.out.println(name + " do shopping ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
