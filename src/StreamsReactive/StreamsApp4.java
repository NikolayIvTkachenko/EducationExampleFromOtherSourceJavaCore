package StreamsReactive;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsApp4 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(3);
		
		System.out.println(list);
		
		int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
		System.out.println(result);
		
		List<Integer> list100 = new ArrayList<>();
		Optional<Integer> result100 = list100.stream().reduce((accumulator, element) -> accumulator * element);
		if (result100.isPresent()) {
			System.out.println(result100.get());
		}else {
			System.out.println("Not present!");
		}
		
		System.out.println("=======");
		
		int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
		System.out.println(result2);

		System.out.println("=======");
		
		List<String> list5 = new ArrayList<>();
		list5.add("Hello");
		list5.add("How are you?");
		list5.add("normal");
		list5.add("Bay");
		
		String result5 = list5.stream().reduce((a, e) -> a + " " + e).get();
		System.out.println("result5 = "+result5);
		System.out.println("=======");
		
	}

}
