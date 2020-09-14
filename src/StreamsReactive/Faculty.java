package StreamsReactive;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	String name;
	List<Student> studentsOnFacuty;
	
	public Faculty(String name) {
		this.name = name;
		studentsOnFacuty = new ArrayList<>();
	}

	public List<Student> getStudentsOnFacuty() {
		return studentsOnFacuty;
	}

	public void addStudentToFaculty(Student st) {
		studentsOnFacuty.add(st);
	}
	

}
