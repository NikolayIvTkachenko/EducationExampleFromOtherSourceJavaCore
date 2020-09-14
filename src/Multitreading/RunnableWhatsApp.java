package Multitreading;

public class RunnableWhatsApp implements Runnable{

	@Override
	public void run() {
		new Example12().whatsappCall();
		
	}

}
