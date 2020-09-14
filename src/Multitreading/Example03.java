package Multitreading;

public class Example03 {

	public static void main(String[] args) {
		
		
		//MyThread3 tread3 = new MyThread3();
		//MyThread4 tread4 = new MyThread4();
		//tread3.run();
		//tread4.run();
		
		Thread tread3 = new Thread(new MyThread3());
		Thread tread4 = new Thread(new MyThread4());
		tread3.start();
		tread4.start();


	}

}
