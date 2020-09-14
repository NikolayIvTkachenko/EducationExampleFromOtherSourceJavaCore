package Multitreading;

public class RunClass  implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 1000 ; i++) {
			Example11.increment();
		}
		
		
	}

}
