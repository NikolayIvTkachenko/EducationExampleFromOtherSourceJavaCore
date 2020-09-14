package StreamsReactive;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsApp9 {

	public static void main(String[] args) {
		
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

		
		Map<Integer, List<Student>> map = students.stream().map(e1 -> {
			e1.setName(e1.getName().toUpperCase());
			return e1;
		}).collect(Collectors.groupingBy(e1 -> e1.getCourse()));
		
		for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().toString());
		}
		
		System.out.println("=================");
		
		Map<Boolean, List<Student>> map2 = students.stream().map(e1 -> {
			e1.setName(e1.getName().toUpperCase());
			return e1;
		}).collect(Collectors.partitioningBy(e1 -> e1.getAvgGrade() > 7));
		
		for(Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue().toString());
		}

		System.out.println("=================");
		
		Student first = students.parallelStream()
		.map(element -> {
			element.setName(element.getName().toUpperCase()); 
			return element;
		})
		.filter(element -> element.getSex() == 'f')
		.sorted((x, y) -> y.getAge() - x.getAge())
		.findFirst().get();
		System.out.println("first = "+first);
		
		System.out.println("=================");
		
		Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
		Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
		
		System.out.println("min = "+ min);
		System.out.println("max = "+max);
		
		
		System.out.println("=================");
		students.stream().filter(e -> e.getAge()>20)
		.limit(2)
		.forEach(System.out::println);
		System.out.println("=================");
		students.stream().filter(e -> e.getAge()>20)
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println("=================");
		List<Integer> courses = students.stream()
				.mapToInt(e1 -> e1.getCourse())
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("courses = "+courses);
		System.out.println("=================");
		
		List<Double> grades = students.stream()
				.mapToDouble(e1 -> e1.getAvgGrade())
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("grades = "+grades);
		System.out.println("=================");
		
		
		
		int sum = students.stream()
				.mapToInt(e1 -> e1.getCourse()).sum();
		Double average = students.stream()
				.mapToInt(e1 -> e1.getCourse()).average().getAsDouble();
		
		int min1 = students.stream()
				.mapToInt(e1 -> e1.getCourse()).min().getAsInt();
		int max1 = students.stream()
				.mapToInt(e1 -> e1.getCourse()).max().getAsInt();
		
		System.out.println("sum = "+sum);
		System.out.println("average = "+average);
		System.out.println("min = "+min1);
		System.out.println("max = "+max1);
		System.out.println("=================");
		
	}

}
