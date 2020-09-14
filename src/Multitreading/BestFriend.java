package Multitreading;

import java.util.List;
import java.util.concurrent.Exchanger;

public class BestFriend extends Thread {
	
	private String name;
	private Exchanger<Action> exchanger;
	private List<Action> actions;
	
	public BestFriend(String name, List<Action> actions, Exchanger<Action> exchanger) {
		this.name = name;
		this.exchanger = exchanger;
		this.actions = actions;
		this.start();
	}
	
	private void whoWins(Action action, Action friendsAction) {
		if(action == Action.ROCK && friendsAction == Action.SCISSORS
				|| action == Action.SCISSORS && friendsAction == Action.PAPER
				|| action == Action.PAPER && friendsAction == Action.ROCK) {
			System.out.println(name + " WIND!!! ");
		}
	}
	
	public void run() {
		Action reply;
		for(Action action : actions) {
			try {
				reply = exchanger.exchange(action);
				whoWins(action, reply);
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
