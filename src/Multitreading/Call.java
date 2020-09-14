package Multitreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {
	
	private Lock lock = new ReentrantLock();
	
	void mobileCall() {
		lock.lock();
		
		try {
			System.out.println("Mobile call starts");
			Thread.sleep(3000);
			System.out.println("Mobile call ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
	
	void skypeCall() {
		lock.lock();
		
		try {
			System.out.println("Skype call starts");
			Thread.sleep(5000);
			System.out.println("Skype  call ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
	
	void whatsappCall() {
		lock.lock();
		
		try {
			System.out.println("WhatsApp call starts");
			Thread.sleep(8000);
			System.out.println("WhatsApp call ends");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}

}
