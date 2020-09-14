package Multitreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) {
		
		Semaphore callbox = new Semaphore(2);
		
		new Person("Nick", callbox);
		new Person("Oleg", callbox);
		new Person("Elena", callbox);
		new Person("Viktor", callbox);
		new Person("Marina", callbox);

	}

}
