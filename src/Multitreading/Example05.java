package Multitreading;

public class Example05 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread());
		
		MyThread5 thread5 = new MyThread5();
		thread5.setName("potok-000");
		thread5.setPriority(9);
		System.out.println("thread5 : " + thread5.getName());
		System.out.println("thread5 : " + thread5.getPriority());
		
		
		MyThread5 thread6 = new MyThread5();
		thread6.setPriority(Thread.MAX_PRIORITY);
		System.out.println("thread6 : " + thread6.getName());
		System.out.println("thread6 : " + thread6.getPriority());
		
		for(int i = 5; i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("gooo");
		
	}

}
