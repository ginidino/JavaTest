package BoundedCounter;

import java.util.Scanner;

public class BoundedCounter4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int sec = Integer.parseInt(reader.nextLine()); // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int min = Integer.parseInt(reader.nextLine()); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int hour = Integer.parseInt(reader.nextLine()); // read the initial value of hours from the user

        seconds.setValue(sec);
        minutes.setValue(min);
        hours.setValue(hour);
        
        for (int i = 0; i < 121; i++) {
        	System.out.println(hours + ":" + minutes + ":" + seconds);
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
