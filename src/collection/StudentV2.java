package collection;

final public class StudentV2 implements Comparable<StudentV2>{

	final String name;
	final String surname;
	final int course;
	
	
	public StudentV2(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}
	
	


	@Override
	public String toString() {
		return "StudentV2 [name=" + name + ", surname=" + surname + ", course=" + course + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		StudentV2 other = (StudentV2) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}




	@Override
	public int compareTo(StudentV2 o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
}
