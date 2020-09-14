package scanner;

import java.util.Scanner;

public class Scanner1 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int i = scanner.nextInt();
		
		System.out.println("Inputed number: " + i);
		
		String s = scanner.nextLine();
		
		Scanner scan = new Scanner("Privet\n How are you?" + "Hello");
		System.out.println(scan.next().charAt(2));
	}

}
