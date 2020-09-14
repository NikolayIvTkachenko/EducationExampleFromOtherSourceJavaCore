package NestedClass;

public class LocalInnerClassApp {

	public static void main(String[] args) {
		Math math = new Math();
		math.getResult();
		System.out.println("-----");
		math.getResult(23,4);
		System.out.println("-----");
		
		class Addition implements Math2{
			@Override
			public int doOperation(int a, int b) {
				return a + b;
			}
		}
		
		Addition add1 = new Addition();
		System.out.println(add1.doOperation(6, 7));
		
	}

}
