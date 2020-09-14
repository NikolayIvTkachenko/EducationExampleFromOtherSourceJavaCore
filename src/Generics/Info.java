package Generics;

class Info<T> {
	
	private T value;
	public Info(T value) {
		this.value = value;
	}
	
	public String toString(){
		return "{[" + value + "]}";
	}
	
	public T getValue() {
		return value;
	}
	
}
