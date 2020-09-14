package Multitreading;

public class Consumer implements Runnable{
	
	
	Market market;
	
	Consumer(Market market){
		this.market = market;
	}
	

	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			market.getBread();
		}
		
	}

}
