package StreamsReactive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsApp1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("How are you?");
		list.add("normal");
		list.add("Bay");
		
//		for(int i = 0; i < list.size(); i++) {
//			list.set(i, String.valueOf(list.get(i).length()));
//		}
		
		List<Integer> list2 = list.stream().map(e -> e.length()).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(list2);
		
		int[] array = {5, 9, 3, 8, 1};
		int[] list3 = Arrays.stream(array).map(el -> {
			if (el%3 == 0) {
				el = el/3;
			}
			return el;
		}).toArray();

		System.out.println(Arrays.toString(list3));
		
		Set<String> set1 = new TreeSet<>();
		set1.add("Hello");
		set1.add("How are you?");
		set1.add("normal");
		set1.add("Bay");
		System.out.println(set1);
		
		
		Set<Integer> set2 = set1.stream().map(e -> e.length()).collect(Collectors.toSet());
		List<Integer> list5 = set1.stream().map(e -> e.length()).collect(Collectors.toList());
		System.out.println(set2);
		System.out.println(list5);
	}

}
