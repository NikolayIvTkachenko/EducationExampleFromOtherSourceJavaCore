package Multitreading;

public class MyRunnableIml18 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			AtomicIntegerExample.increment();
		}
		
	}

}
