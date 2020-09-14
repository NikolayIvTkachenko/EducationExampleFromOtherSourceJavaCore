package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		
		List<EmployeeV2> list = new ArrayList<>();
		EmployeeV2 emp1 = new EmployeeV2(100, "Nick", "Petrov", 100000);
		EmployeeV2 emp2 = new EmployeeV2(108, "Vasya", "Vasilyev", 100000);
		EmployeeV2 emp3 = new EmployeeV2(103, "Maria", "Ivanova", 100000);
		
		//Arrays.parallelSort(new Employee[] {emp1, emp2, emp3});
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("Before sorted");
		System.out.println(list);
		
		Collections.sort(list);
		//Collections.sort(list, new IdComparator());
		
		System.out.println("After sorted");
		System.out.println(list);

	}

}
