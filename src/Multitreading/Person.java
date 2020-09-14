package Multitreading;

import java.util.concurrent.Semaphore;

public class Person extends Thread {
	
	String name;
	private Semaphore callBox;
	
	public Person(String name, Semaphore callBox) {
		this.name = name;
		this.callBox = callBox;
		this.start();
	}
	
	
	public void run() {
		
		
		try {
			System.out.println(name + " waiting.... ");
			callBox.acquire();
			System.out.println(name + " using phone ");
			sleep(2000);
			System.out.println(name + " End call ");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			callBox.release();
		}
	}

}
