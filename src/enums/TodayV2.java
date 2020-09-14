package enums;

public class TodayV2 {

	WeekDaysV2 weekDay;

	
	public TodayV2(WeekDaysV2 weekday) {
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
		
		System.out.println("Mood in this days: " + weekDay.getMood());
		
	}
	
}
