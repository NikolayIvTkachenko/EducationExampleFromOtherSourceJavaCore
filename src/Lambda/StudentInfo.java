package Lambda;

import java.util.ArrayList;

public class StudentInfo {
	
	void testStudents(ArrayList<Student> al, StudentChecks sc) {
		for(Student s : al) {
			if(sc.check(s)) {
				System.out.println(s);
			}		
		}
	}
	

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
		
//		StudentInfo info = new StudentInfo();
//		info.printStudentOverGrade(students, 8);
//		
//		System.out.println("------------------");
//		info.printStudentUnderAge(students, 30);
//		
//		System.out.println("------------------");
//		info.printStudentMixCondition(students, 20, 9.5, 'f');
		
	}
	
	
	
//	void printStudentOverGrade(ArrayList<Student> al, double grade) {
//		
//		for(Student s : al) {
//			if(s.avgGrade > grade) {
//				System.out.println(s);
//			}
//		}
//		
//	}
//	
//	void printStudentUnderAge(ArrayList<Student> al, int age) {
//		
//		for(Student s : al) {
//			if(s.age > age) {
//				System.out.println(s);
//			}
//		}
//		
//	}
//	
//	void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//		
//		for(Student s : al) {
//			if(s.age > age && s.avgGrade < grade && s.sex == sex) {
//				System.out.println(s);
//			}
//		}
//		
//	}
	

}
