package StreamsReactive;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp_Parralel_10 {

	public static void main(String[] args) {
		
		// 1 2 3 4 ... 1000000000
		
		// 1 250 000000
		// 250 000001 500 000000
		// 500 000001 750 000000
		// 750 000001 1000 000000
		
		List<Double> list = new ArrayList<>();
		list.add(10.0);
		list.add(5.0);
		list.add(1.0);
		list.add(0.25);
		
		double sumResult = list.stream()
				.reduce((accumulator, element) -> accumulator + element).get();
		System.out.println("sumAccumulator = " + sumResult);
		

		sumResult = list.parallelStream()
				.reduce((accumulator, element) -> accumulator + element).get();
		System.out.println("sumAccumulator = " + sumResult);
		
		
		//Working incoorect!!!!!!!!
		double divResult = list.parallelStream()
				.reduce((accumulator, element) -> accumulator/element).get();
		System.out.println("divResult = " + divResult);
		
	}

}
