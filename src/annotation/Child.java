package annotation;

public class Child extends Parent{
	
	
	public Child(String name) {
		super(name);
	}
	
	@Override
	void showInfo() {
		System.out.println("It's Chaild class. Name = " + name);
	}
	
}
