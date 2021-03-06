package Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;;

public class TesyCunsumerApp4 {

	public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
		ArrayList<Car> al = new ArrayList<>();
		for(int i = 0; i< 3; i++) {
			al.add(carSupplier.get());
		}
		
		return al;
	}
	
	public static void changeCar(Car car, Consumer<Car> carConsumer) {
		carConsumer.accept(car);
	}

	public static void main(String[] args) {
		
		ArrayList<Car> ourCars = createThreeCars(() -> new Car("BMV", "Black", 400));
		System.out.println("Our cars: " + ourCars);

		
		changeCar(ourCars.get(0), car -> {
			car.color = "red";
			car.engine = 500;
			System.out.println("upgraded car: " + car);
		});
		
		System.out.println("Our cars: " + ourCars);
	}


}
