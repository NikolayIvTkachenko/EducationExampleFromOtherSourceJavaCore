package collection;

import java.util.Stack;
import java.util.Vector;

public class StackEx1 {

	public static void main(String[] args) {
		
		//add get remove firstElement lasElement
		Stack<String> stack = new Stack<>();
		stack.add("Nick");
		stack.add("Ivan");
		stack.add("Maria");
		stack.add("Elena");
		
		System.out.println("stack = " + stack);
		System.out.println("stack.pop() = " + stack.pop());
		System.out.println("stack = " + stack);
//		while(!stack.isEmpty()) {
//			System.out.println("stack.pop() = " + stack.pop());
//			System.out.println("stack = " + stack);
//			
//		}
		System.out.println("stack.peek() = " + stack.peek());
		System.out.println("stack = " + stack);
		
		
		System.out.println("===");
		System.out.println("start main tread");
		abs3();
		System.out.println("end main tread");
	}
	
	
	static void abs1(){
		System.out.println("abc1 starts");
		System.out.println("abc1 ends");
	}
	
	static void abs2(){
		System.out.println("abc2 starts");
		abs1();
		System.out.println("abc2 ends");
	}
	
	static void abs3(){
		System.out.println("abc3 starts");
		abs2();
		System.out.println("abc3 ends");
	}
	
}
