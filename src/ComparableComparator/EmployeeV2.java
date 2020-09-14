package ComparableComparator;



public class EmployeeV2 implements Comparable<EmployeeV2> {
	
	//Integer id;
	int id;
	String name;
	String surname;
	int salary;
	
	
	public EmployeeV2(int id, String name, String surname, int salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}


	//-1 если меньше
	//0 если равны
	//1 усли больше
	
	@Override
	public int compareTo(EmployeeV2 another) {
		
		if(this.id == another.id) {
			return 0;
		}else if (this.id < another.id) {
			return -1;
		}else {
			return 1;
		}
		
		//return this.id - another.id;
		
		//return this.id.compareTo(another.id); //if id is Integer
		
		//return this.name.compareTo(another.name);
		
//		int res = this.name.compareTo(another.name);
//		if (res == 0) {
//			res = this.surname.compareTo(another.surname);
//		}
//		return res;
//		
	}
	
	

}

