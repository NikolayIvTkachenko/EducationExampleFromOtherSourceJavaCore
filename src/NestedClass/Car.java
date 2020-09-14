package NestedClass;

public class Car {
	
	String color;
	int doorCount;
	Engine engine;
	
	public Car(String color, int doorCount, Engine engine) {
		this.color = color;
		this.doorCount = doorCount;
		this.engine = engine;
	}

	void method() {
		System.out.println(Engine.countOfObjects);
		Engine e = new Engine(200);
		System.out.println(e.horsePower);
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", "
				+ "doorCount=" + doorCount 
				+ "Engine=" + engine + "]";
	}
	
	interface I{}
	
	public final static class Engine {
		
		int horsePower;
		static int countOfObjects;

		public Engine(int horsePower) {
			this.horsePower = horsePower;
			countOfObjects++;
		}

		@Override
		public String toString() {
			return "Engine [horsePower=" + horsePower + "]";
		}
		
	}

}
