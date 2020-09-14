package StreamsFiles.Programmer1;

import java.io.Serializable;

public class Car implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	String model;
	String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
	
}
