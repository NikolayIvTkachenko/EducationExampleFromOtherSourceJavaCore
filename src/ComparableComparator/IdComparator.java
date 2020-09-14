package ComparableComparator;

import java.util.Comparator;

public class IdComparator implements Comparator<EmployeeV2> {

	@Override
	public int compare(EmployeeV2 o1, EmployeeV2 o2) {
		
		if(o1.id == o2.id) {
			return 0;
		}else if (o1.id < o2.id) {
			return -1;
		}else {
			return 1;
		}
	}
	
	

}
