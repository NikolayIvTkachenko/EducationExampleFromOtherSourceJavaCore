package Generics;

public class ParameterizedClass2 {
	public static void main(String[] args) {
		
		Pair<String, Integer> pair1 = new Pair<>("private", 20);
		System.out.println("Znachenie : value1 = " + pair1.getFirstValue() 
		+ ", value2 = " + pair1.getSecondValue() );
		
		Pair<Double, Integer> pair2 = new Pair<>(0.5, 20);
		System.out.println("Znachenie : value1 = " + pair2.getFirstValue() 
		+ ", value2 = " + pair2.getSecondValue() );
		
		OtherPair<String> otherPair1 = new OtherPair<>("privet", "Name");
		System.out.println("Znachenie : value1 = " + otherPair1.getFirstValue() 
		+ ", value2 = " + otherPair1.getSecondValue() );
		
		//E - Element
		//K - Keys
		//V - Value
		//K, V -- Map <K, V>
		//T - TypePlaceholder
		
	}
}
