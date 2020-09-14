package Multitreading;

public class MyThread4 implements Runnable{

	@Override
	public void run() {
		for(int i = 1000; i > 0; i--) {
			System.out.println(i);
		}
		
	}

}
