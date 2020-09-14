package Multitreading;

import java.util.concurrent.Callable;

public class Factorial2 implements Callable{

	
	int f;
	
	public Factorial2(int f) {
		this.f = f;
	}
	
	
	@Override
	public Integer call() throws Exception {
		if (f <= 0) {
			throw new Exception("Incorrect number");
		}
		int result = 1;
		for(int i = 1; i <=f; i++) {
			result *= i;
		}
		Thread.sleep(1000);
		
		return result;
	}

}
