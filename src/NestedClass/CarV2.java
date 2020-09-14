package NestedClass;

import NestedClass.Car.Engine;

public class CarV2 {

	String color;
	int doorCount;
	EngineV2 engine;
	
	public CarV2(String color, int doorCount, int horsePower) {
		this.color = color;
		this.doorCount = doorCount;
		this.engine = this.new EngineV2(horsePower);
	}
	
	public CarV2(String color, int doorCount) {
		this.color = color;
		this.doorCount = doorCount;
	}
	
//	public CarV2(String color, int doorCount) {
//		this.color = color;
//		this.doorCount = doorCount;
//		EngineV2 e = new EngineV2(400);
//		System.out.println(e.horsePower);
//	}
	
	public void setEngine(EngineV2 engine) {
		this.engine = engine;
	}

	
	@Override
	public String toString() {
		return "Car [color=" + color + ", "
				+ "doorCount=" + doorCount 
				+ "Engine=" + engine + "]";
	}
	
	interface I{}
	
	public class EngineV2 {
		
		int horsePower;

		public EngineV2(int horsePower) {
			this.horsePower = horsePower;
			
		}
		
		

		@Override
		public String toString() {
			return "Engine [horsePower=" + horsePower + "]";
		}
		
	}

}
