package Multitreading;

public class Worker implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Work begins");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Work ends");
	}

}
