package Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TestSupplierApp3 {
	
	public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
		ArrayList<Car> al = new ArrayList<>();
		for(int i = 0; i< 3; i++) {
			al.add(carSupplier.get());
		}
		
		return al;
	}

	public static void main(String[] args) {
		
		ArrayList<Car> ourCars = createThreeCars(() -> new Car("BMV", "Black", 400));
		System.out.println("Our cars: " + ourCars);

	}

}
