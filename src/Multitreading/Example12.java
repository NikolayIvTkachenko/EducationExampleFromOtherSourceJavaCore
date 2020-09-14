package Multitreading;

public class Example12 {

	static final Car car = new Car();
	static final Object lock = new Object();

	//synchronized void mobileCall() -> not working
	void mobileCall() {
		synchronized (lock) {
			System.out.println(this);
			System.out.println(lock);
			System.out.println("Mobile call starts");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Mobile call ends");
		}
	}


	//synchronized void skypeCall() -> not working
	void skypeCall() {
		synchronized (lock) {
			System.out.println(this);
			System.out.println(lock);
			System.out.println("Skype call starts");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Skype call ends");
		}
	}

	//synchronized void whatsappCall() { -> not working
	void whatsappCall() {
		synchronized (lock) {
			System.out.println(this);
			System.out.println(lock);
			System.out.println("WhatsApp call starts");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("WhatsApp call ends");
		}
	}


	public static void main(String[] args) {

		//monitor

		Thread thread1 = new Thread(new RunnableMobile());
		Thread thread2 = new Thread(new RunnableSkype());
		Thread thread3 = new Thread(new RunnableWhatsApp());

		thread1.start();
		thread2.start();
		thread3.start();


	}

}
