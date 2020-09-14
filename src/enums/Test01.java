package enums;

public class Test01 {
	
	void method(String dayOfWeek) {
		
		System.out.println("Today is: " + dayOfWeek);
	}
	
	public static void main(String[] args) {
		
		Test01 t = new Test01();
		t.method("Monday");
		
		
	}
	

}
