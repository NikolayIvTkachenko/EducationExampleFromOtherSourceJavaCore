package enums;

public class Today {
	
	WeekDays weekDay;
	
	public Today(WeekDays weekday) {
		this.weekDay = weekday;
	}

	
	void daysInfo() {
		switch(weekDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.out.println("Go to work");
				break;
			case SATURDAY:
			case SUNDAY:	
		
				System.out.println("Have a rest!");
				break;
		
		}
	}
	
}
