package Multitreading;

public class Example08 extends Thread {
	
	
	public void run() {
		
		for(int i = 5; i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " +
					Thread.currentThread().getPriority() + "   = " + i);
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new MyRunnable1());
		Example08 thread2 = new Example08();
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
		
		System.out.println("END");

	}

}
