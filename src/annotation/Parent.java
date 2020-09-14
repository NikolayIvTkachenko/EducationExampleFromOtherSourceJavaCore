package annotation;

public class Parent {
	
	String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
	@Deprecated
	void showInfo() {
		System.out.println("It's Parent class. Name = " + name);
	}

}
