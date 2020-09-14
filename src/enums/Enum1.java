package enums;

import java.util.Arrays;

public class Enum1 {
	
	
	public static void main(String[] args) {
		
		Today today = new Today(WeekDays.MONDAY);
		today.daysInfo();
		
		Today today1 = new Today(WeekDays.SUNDAY);
		today1.daysInfo();
		
		
		TodayV2 todayV2 = new TodayV2(WeekDaysV2.MONDAY);
		todayV2.daysInfo();
		
		TodayV2 todayV21 = new TodayV2(WeekDaysV2.SUNDAY);
		todayV21.daysInfo();
		
		WeekDaysV2 w1 = WeekDaysV2.MONDAY;
		WeekDaysV2 w2 = WeekDaysV2.MONDAY;
		WeekDaysV2 w3 = WeekDaysV2.FRIDAY;
		
		System.out.println(w1 == w2);
		System.out.println(w2 == w3);
		
		WeekDays w15 = WeekDays.valueOf("MONDAY");
		System.out.println(w15);
		
		WeekDays[] array = WeekDays.values();
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
