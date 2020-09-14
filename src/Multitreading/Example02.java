package Multitreading;

public class Example02 extends Thread{
	
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		Example02 thread1 = new Example02();
		thread1.start();
		
		for(int i = 1000; i > 0; i--) {
			System.out.println(i);
		}
		

	}

}
