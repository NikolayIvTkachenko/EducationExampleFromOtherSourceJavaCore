package StreamsReactive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsApp6 {

	public static void main(String[] args) {
		
		int []  array = {3,8,1,5,9,12,4,21,81,7,18};
		System.out.println("Before = " + Arrays.toString(array));
		int result = Arrays.stream(array)
				.filter(e->e%2==1)
				.map(e->{if(e%3==0) {e=e/3;}return e;})
				.reduce((a, e) -> a+e)
				.getAsInt();
		System.out.println("result = " + result);
		//System.out.println("After = " + Arrays.toString(array));
		
		System.out.println("=============");
		
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 35, 4, 7);
		Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
		
		List<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		students.parallelStream()
		.map(element -> {
			element.setName(element.getName().toUpperCase()); 
			return element;
		})
		.filter(element -> element.getSex() == 'f')
		.sorted((x, y) -> y.getAge() - x.getAge())
		.forEach(element -> System.out.println(element));
		
		
		
	}
}
