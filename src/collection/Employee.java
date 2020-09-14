package collection;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	int salary;
	
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Employee o) {
		int result = this.id - o.id;
		
		if (result == 0) {
			result = this.name.compareTo(o.name);
		}
		
		return result;
	}



	
	
	
	
}
