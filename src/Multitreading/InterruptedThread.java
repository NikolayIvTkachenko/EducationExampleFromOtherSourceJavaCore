package Multitreading;

public class InterruptedThread extends Thread {

	double sqrtSum = 0;
	
	public void run() {
		for(int i = 1; i <= 100000000; i++) {
			if (isInterrupted()) {
				System.out.println("The trhead is interrupted. End thread");
				System.out.println(sqrtSum);
				return;
			}
			sqrtSum += Math.sqrt(i);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("e = " + e);
				System.out.println("The trhead is interrupted while it's sleep. End thread");
				return;
			}
			
		}
		System.out.println(sqrtSum);
	}
	
	
}
