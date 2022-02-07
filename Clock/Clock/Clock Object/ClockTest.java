package BoundedCounter;

public class ClockTest {
	public static void main(String[] args) {
		Clock clock = new Clock(23, 59, 50);
		
		for (int i = 0; i < 20; i++) {
			System.out.println(clock);
			clock.tick();
		}
	}
}

class Clock {
	private BoundedCounter hours;
	private BoundedCounter minutes;
    private BoundedCounter seconds;

	public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
		// the counters that represent hours, minutes and seconds are created and
	    // set to have the correct initial values
		hours = new BoundedCounter(23);
    	minutes = new BoundedCounter(59);
    	seconds = new BoundedCounter(59);
    	
    	hours.setValue(hoursAtBeginning);
    	minutes.setValue(minutesAtBeginning);
    	seconds.setValue(secondsAtBeginning);
	}

	public void tick() {
		// Clock advances by one second
		seconds.next();
		if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
        }
	}
	
	public String toString() {
		return hours.toString() + ":" + minutes.toString() + ":" + seconds.toString();
	}
}