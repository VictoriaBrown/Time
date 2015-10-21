// Time1.java
// Victoria Brown 10/19/2015
// This program maintains the time in 24-hour format.
public class Time1 {
	private int hour;    // 0 - 23
	private int minute;   // 0 - 59
	private int second;   // 0 - 59
	
	// Set a new time value using universal time; throw an
	// Exception if the hour, minute, or second is invalid.
	public void setTime(int hour, int minute, int second) {
		// Validate hour, minute, and second.
		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || 
				second < 0 || second >= 60)
		{
			throw new IllegalArgumentException(
					"Hour, minute, and/or second was out of range");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// Convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12 : hour % 12),
				minute, second, (hour < 12 ? "AM" : "PM"));
	}
}
