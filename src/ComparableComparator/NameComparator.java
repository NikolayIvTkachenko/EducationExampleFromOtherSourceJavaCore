package ComparableComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 o1, EmployeeV2 o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
