package StreamsReactive;

import java.util.Arrays;

public class StreamsApp3 {

	public static void main(String[] args) {
		
		int[] array = {5, 9, 3, 8, 1};
		Arrays.stream(array).forEach(el ->{
			el *= el;
			System.out.println(el);
		});
		System.out.println(Arrays.toString(array));
		
		Arrays.stream(array).forEach(System.out::println);
		Arrays.stream(array).forEach(Utils::method2);

	}

}
