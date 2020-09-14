package Multitreading;

public class DeamonExample {

	public static void main(String[] args) {
		
		
		System.out.println("Main thread starts ");
		

		UserThread userThread = new UserThread();
		userThread.setName("user thread");
		
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setName("daemon thread");
		daemonThread.setDaemon(true);
		
		
		userThread.start();
		daemonThread.start();
		
		
		System.out.println("Main thread ends ");
	}

}
