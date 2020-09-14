package Reflection;

public class EmployeeV2 {
	
	public int id;
	public String name;
	public String department;
	private double salary = 1000;
	
	public EmployeeV2() {
		
	}

	public EmployeeV2(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

//	public EmployeeV2(int id, String name, String department, double salary) {
//		this.id = id;
//		this.name = name;
//		this.department = department;
//		this.salary = salary;
//	}

//	public double getSalary() {
//		return salary;
//	}
//
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	
	private void changeDepartment(String newDepartment) {
		this.department = newDepartment;
		System.out.println("New department is: " + this.department);
	}

	public void increaseSalary() {
		this.salary *= 2;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	

}
