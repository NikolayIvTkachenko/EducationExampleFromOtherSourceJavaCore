package Multitreading;

public class RunnableImpl100 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

		try {
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
