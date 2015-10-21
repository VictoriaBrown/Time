// Time1Test.java
// Victoria Brown 10/19/2015
// Using the Time1 object.
public class Time1Test {
	public static void main(String[] args) {
		// Create and initialize Time1 object.
		Time1 time = new Time1();    // Invoke Time1 constructor.
		
		// Output string representations of the time.
		displayTime("After time object is created", time);
		System.out.println();
		
		// Change time and output updated time.
		time.setTime(13, 27, 6);
		displayTime("After calling setTime", time);
		System.out.println();
		
		// Attempt to set time with invalid values.
		try {
			time.setTime(99,  99, 99);    // All values out of range.
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// Display time after attempt to set invalid values.
		displayTime("After calling setTime with invalid values", time);
	}
	
	// Displays a Time1 object in 24-hour and 12-hour formats.
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
				header, t.toUniversalString(), t.toString());
	}
}
