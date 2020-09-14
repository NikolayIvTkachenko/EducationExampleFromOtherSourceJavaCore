package Multitreading;

public class Example04 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 1000; i > 0; i--) {
					//System.out.println(i);
				}
				System.out.println("message");
				
			}
			
		}).start();
		
		new Thread(() -> System.out.println("message")).start();
		
	}
	
}
