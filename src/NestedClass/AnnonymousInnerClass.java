package NestedClass;

public class AnnonymousInnerClass {
	
	private int x = 7;

	public static void main(String[] args) {
		
		Math2 m = new Math2() {
			int c = 10;
			void methodA() {
				
			}
			@Override
			public int doOperation(int a, int b) {
				AnnonymousInnerClass as = new AnnonymousInnerClass();
				return a + b + as.x;
			}	
		};
		
		System.out.println(m.doOperation(4, 5));
		
		Math2 m2 = new Math2() {
			int c = 10;
			void methodA() {
				
			}
			@Override
			public int doOperation(int a, int b) {
				return a * b;
			}	
		};
		
		System.out.println(m2.doOperation(4, 5));
		
		
		
//		System.out.println(new Math2() {
//			@Override
//			public int doOperation(int a, int b) {
//				return a + b;
//			}	
//		});
		

	}

}
