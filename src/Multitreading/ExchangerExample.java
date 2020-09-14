package Multitreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

	
	public static void main(String[] args) {
	
		Exchanger<Action> excanger = new Exchanger<>();
		List<Action> friend1Action = new ArrayList<>();
		friend1Action.add(Action.SCISSORS);
		friend1Action.add(Action.PAPER);
		friend1Action.add(Action.SCISSORS);
		
		List<Action> friend2Action = new ArrayList<>();
		friend2Action.add(Action.PAPER);
		friend2Action.add(Action.ROCK);
		friend2Action.add(Action.ROCK);
		
		new BestFriend("Ivan", friend1Action, excanger);
		new BestFriend("Petr", friend2Action, excanger);
		
		

	}

}
