package Multitreading;

public class RunnableSkype implements Runnable{

	@Override
	public void run() {
		new Example12().skypeCall();
		
	}

}
