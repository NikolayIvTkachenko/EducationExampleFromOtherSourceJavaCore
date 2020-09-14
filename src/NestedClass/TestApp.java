package NestedClass;

public class TestApp {

	public static void main(String[] args) {
		
		Car.Engine engine = new Car.Engine(256);
		Car car1 = new Car("red", 4, engine);
		System.out.println(car1.toString());

	}

}
