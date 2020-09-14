package Generics;

class Info2<T extends Number&I1&I2> { //ограничиваем классы которые подходят под тип
	
	private T value;
	public Info2(T value) {
		this.value = value;
	}
	
	public String toString(){
		return "{[" + value + "]}";
	}
	
	public T getValue() {
		return value;
	}
	
}
