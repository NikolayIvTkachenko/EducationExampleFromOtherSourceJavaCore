package enums;

public enum WeekDaysV2 {

	MONDAY("bad"),
	TUESDAY("bad"),
	WEDNESDAY("so-so"),
	THURSDAY("so-so"),
	FRIDAY("good"),
	SATURDAY("good"),
	SUNDAY("good");
	
	private String mood;
	private WeekDaysV2(String mood) {
		this.mood = mood;
	}
	
	public String getMood() {
		return mood;
	}
	
}
