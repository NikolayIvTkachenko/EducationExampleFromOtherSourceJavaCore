package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Nick");
		list.add("Mary");
		list.add("Ivan");
		
		
		System.out.println("Before sorted");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sorted");
		System.out.println(list);
	}
	
	

}
