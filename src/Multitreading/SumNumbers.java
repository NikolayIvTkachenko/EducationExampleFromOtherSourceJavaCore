package Multitreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumbers {
	
	private static long value = 1_000_000_000L;
	private static long sum = 0;
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Work main starts");
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		List<Future<Long>>  futureResults = new ArrayList<>();
		
		long valueDividedBy10 = value / 10;
		
		for(int i = 0; i < 10; i++) {
			long from = valueDividedBy10 * i + 1;
			long to = valueDividedBy10*(i + 1);
			
			PartialSumm task = new PartialSumm(from, to);
			Future<Long> futurePartSum = executorService.submit(task);
			
			
			futureResults.add(futurePartSum);
			
		}
		
		
		for (Future<Long> result : futureResults) {
			sum += result.get();
		}
		
		executorService.shutdown();
		
		System.out.println("sum = " + sum);
		
		System.out.println("Work main ends");
		

	}

}
