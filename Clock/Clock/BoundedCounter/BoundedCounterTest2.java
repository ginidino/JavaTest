package BoundedCounter;

// using try-catch loop
public class BoundedCounterTest2 {
	public static void main(String[] args) {
		BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
            seconds.next();
        	if(seconds.getValue() == 0) {
        		minutes.next();
        		if(minutes.getValue() == 0) {
        			hours.next();
        		}
        	}
        }
	}
}
