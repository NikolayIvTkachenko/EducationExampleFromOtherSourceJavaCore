package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchEx1 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(-3);
		arrayList.add(8);
		arrayList.add(12);
		arrayList.add(-8);
		arrayList.add(0);
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(1);
		arrayList.add(150);
		arrayList.add(-30);
		arrayList.add(19);
		
		int index1 = Collections.binarySearch(arrayList, 12);
		System.out.println("index1 = " + index1);
		//если  отрицательное значение то искомый элемент не найден
		
		Collections.sort(arrayList);
		int index2 = Collections.binarySearch(arrayList, 12);
		System.out.println("index1 = " + index2);
		
		System.out.println("====");
		System.out.println("arrayList = " + arrayList);
		Collections.reverse(arrayList);
		System.out.println("arrayList = " + arrayList);
		Collections.shuffle(arrayList);
		System.out.println("arrayList = " + arrayList);
		
		
		List<Employee> employeeList = new ArrayList<>();
		Employee emp1 = new Employee(100, "Ivan", 100000);
		Employee emp2 = new Employee(15, "Kolya", 50000);
		Employee emp3 = new Employee(123, "Petr", 700000);
		Employee emp4 = new Employee(15, "Maria", 6000);
		Employee emp5 = new Employee(182, "Sasha", 15000);
		Employee emp6 = new Employee(15, "Elena", 10000);
		Employee emp7 = new Employee(250, "Vasya", 188000);
		
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		
		System.out.println("employeeList = " + employeeList);
		Collections.sort(employeeList);
		System.out.println("employeeList = " + employeeList);
		
		int index4 = Collections.binarySearch(employeeList, new Employee(182, "Sasha", 15000));
		System.out.println("index4 = " + index4);
		
		
		int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
		System.out.println("array = " + Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println("array = " + Arrays.toString(array));
		int index5 = Arrays.binarySearch(array, 150);
		System.out.println("index5 = " + index5);
	}

}
