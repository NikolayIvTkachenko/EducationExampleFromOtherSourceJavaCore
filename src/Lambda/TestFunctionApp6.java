package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunctionApp6 {

	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 35, 4, 7);
		Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		
		Function<Student, Double> f = student -> student.avgGrade;
		double res = avgOfSmth(students , f);
		System.out.println("------------------");
		System.out.println("res = " + res);
		

	}
	
	private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
		
		double result =0;
		
		for(Student st : list) {
			result += f.apply(st);
		}

		
		return result;
	}

}
