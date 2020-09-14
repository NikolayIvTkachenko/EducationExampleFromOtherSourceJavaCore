package Lambda;

public class Car {
	
	String model;
	String color;
	double engine;
	
	
	public Car(String model, String color, double engine) {
		this.model = model;
		this.color = color;
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	
	
	
	

}
