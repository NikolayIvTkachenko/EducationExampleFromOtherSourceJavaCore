package collection;

public class StudentV3 implements Comparable<StudentV3>{
	
	String name;
	int course;
	
	
	public StudentV3(String name, int course) {
		this.name = name;
		this.course = course;
	}


	@Override
	public String toString() {
		return "StudentV3 [name=" + name + ", course=" + course + "]";
	}


	@Override
	public int compareTo(StudentV3 other) {
		
		return this.course - other.course;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentV3 other = (StudentV3) obj;
		if (course != other.course)
			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
		return true;
	}
	
	
	

}
