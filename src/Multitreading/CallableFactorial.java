package Multitreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFactorial{
	
	static int factorialResult;

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executerService = Executors.newSingleThreadExecutor();
		
		Factorial2 factorial2 = new Factorial2(6);
		Future<Integer> future = executerService.submit(factorial2);
		
		try {
			System.out.println("future.isDone() = " + future.isDone());
			System.out.println("We want get result");
			factorialResult = future.get();
			System.out.println("We just get result");
			System.out.println("future.isDone() = " + future.isDone());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e = " + e.getCause());
		}finally{
			executerService.shutdown();
		}
		
		//not nessary becuasre 
		//executerService.awaitTermination(10, TimeUnit.SECONDS);

		
		System.out.println(factorialResult);
		
	}
	
	
	

}
