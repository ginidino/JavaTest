package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
	public static void main(String[] args) {
		Calendar cl= Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    System.out.println(sdf.format(cl.getTime()));
	    
	    int year = cl.get(Calendar.YEAR);
	    int month = cl.get(Calendar.MONTH);
	    int day = cl.get(Calendar.DATE);
	    
	    System.out.println("Today is " + year +"-" + (month+1) + "-" + day);
	    
	    System.out.println(2+2);
	}
}
