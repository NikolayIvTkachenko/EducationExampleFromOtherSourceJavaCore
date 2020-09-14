package Multitreading;

public class MyRunnubleImpl2 implements Runnable{

	
	private void doWork2() {
		System.out.print("Urra!!!!");
	}
	
	
	public void doWork1() {
		doWork2();
		
		
		//Object obj  = new Object();
		synchronized (this) {
		//synchronized (obj) {
			Counter2.count++;
			System.out.print(Counter2.count + " ");
		}
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i<3; i++) {
			doWork1();
		}
		
	}
}
