package NestedClass;

public class Math {
	
	private int d = 10;
	
	public void getResult() {
		
		class Divide{
			private int a;
			private int b;
			
			
			public int getA() {
				return a;
			}
			public void setA(int a) {
				this.a = a;
			}
			public int getB() {
				return b;
			}
			public void setB(int b) {
				this.b = b;
			}
			
			public int getResult() {
				return a/b;
			}
			
			public int getOstatok() {
				System.out.println("d = " + d);
				return a%b;
			}
		}
		
		
		Divide divide = new Divide();
		divide.setA(21);
		divide.setB(4);
		
		System.out.println("a = " + divide.getA());
		System.out.println("b = " + divide.getB());
		System.out.println("result = " + divide.getResult());
		System.out.println("ostatok = " + divide.getOstatok());
		
		
		
	}
	
	public void getResult(final int a, final int b) {
		
		class Divide{
			
			public int getA() {
				return a;
			}
		
			public int getB() {
				return b;
			}
			
			public int getResult() {
				return a/b;
			}
			
			public int getOstatok() {
				System.out.println("d = " + d);
				return a%b;
			}
		}
		
	
		Divide divide = new Divide();
		
		System.out.println("a = " + divide.getA());
		System.out.println("b = " + divide.getB());
		System.out.println("result = " + divide.getResult());
		System.out.println("ostatok = " + divide.getOstatok());
		
		
		
	}

}
