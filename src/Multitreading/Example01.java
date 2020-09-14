package Multitreading;

public class Example01 {

	public static void main(String[] args) {
		
		System.out.println("start ");

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("end ");
		
		MyThread1 tread1 = new MyThread1();
		MyThread2 tread2 = new MyThread2();
		
		tread1.start();
		tread2.start();
		
		
		
	}

}
