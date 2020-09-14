package RegExpo;

public class PrintfExample {
	
	static void employeeInfo(Employee emp) {
		System.out.printf("%03d \t Hello: %-12s \t %-12s \t %,.1f \n", emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPst));
	}
	

	public static void main(String[] args) {
		
		//System.out.printf("string -need left edge" +
		//		" second parametr round to 10", "privet", "3.14");
		
		//%[flags][width][.precision]datatype_specifier
		
		Employee emp1 = new Employee(1, "Nick", "Vasilev", 12345, 0.26);
		Employee emp2 = new Employee(1, "Nada", "Petrova", 21215, 0.45);
		Employee emp3 = new Employee(1, "Inna", "Vasileva", 33335, 0.32);
		
		employeeInfo(emp1);
		employeeInfo(emp2);
		employeeInfo(emp3);
		
		String newString = String.format("%03d \t Hello: %-12s \t %-12s \t %,.1f", 1, "Nick", "Vasilev", 12345*(1 + 0.14));
		System.out.println(newString);
		//System.out.printf("", "privet", "3.14");

	}

}
