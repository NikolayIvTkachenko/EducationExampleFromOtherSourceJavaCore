package ComparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(100, "Nick", "Petrov", 100000);
		Employee emp2 = new Employee(108, "Vasya", "Vasilyev", 100000);
		Employee emp3 = new Employee(103, "Maria", "Ivanova", 100000);
		
		//Arrays.parallelSort(new Employee[] {emp1, emp2, emp3});
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("Before sorted");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("After sorted");
		System.out.println(list);
		
	}

}
