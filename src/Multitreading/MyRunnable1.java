package Multitreading;

public class MyRunnable1 implements Runnable{

	@Override
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

}
