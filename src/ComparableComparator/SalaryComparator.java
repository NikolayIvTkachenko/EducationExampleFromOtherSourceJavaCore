package ComparableComparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 o1, EmployeeV2 o2) {
		
		return o1.salary - o2.salary;
	}

}
