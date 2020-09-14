package Multitreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
	
	static int factorialResult;
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ExecutorService executerService = Executors.newSingleThreadExecutor();
		
		Factorial factorial = new Factorial(6);
		
		
		//executerService.execute(factorial);
		
		Future future = executerService.submit(factorial);
		System.out.println(future.get());
		System.out.println(future.isDone());
		
		executerService.shutdown();
		executerService.awaitTermination(10, TimeUnit.SECONDS);

		
		System.out.println(factorialResult);
		
	}

}
