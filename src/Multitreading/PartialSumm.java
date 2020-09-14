package Multitreading;

import java.util.concurrent.Callable;

public class PartialSumm implements Callable<Long> {

	long from;
	long to;
	long localSum;
	
	public PartialSumm(long from, long to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public Long call() throws Exception {
		
		for(long i = from; i <= to; i++) {
			localSum += i;
		}
		System.out.println("Sum from " + from + " to " + to + " = " + localSum);
		
		return localSum;
	}

}
