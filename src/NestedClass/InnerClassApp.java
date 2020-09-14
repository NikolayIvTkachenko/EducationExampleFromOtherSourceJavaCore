package NestedClass;

public class InnerClassApp {

	public static void main(String[] args) {
		
//		CarV2.EngineV2 engine = new CarV2.EngineV2(256);
//		CarV2 car1 = new CarV2("red", 4, engine);
//		System.out.println(car1.toString());
		
		
		CarV2 car1 = new CarV2("red", 4, 300);
		System.out.println(car1.toString());
		
		
		CarV2 car2 = new CarV2("red", 4);
		System.out.println(car2.toString());
		
		CarV2.EngineV2 engine = car2.new EngineV2(150);
		car2.setEngine(engine);
		System.out.println(engine.toString());
		System.out.println(car2.toString());
		
		CarV2.EngineV2 engine3 = new CarV2("Yellow", 4).new EngineV2(400);
		
		
		
	}

}
