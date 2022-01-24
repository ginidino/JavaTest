package Calendar;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MyCalendar {
	static MyCalendar cal = new MyCalendar();
	
	public static void main(String[] args) {
		cal.starter();
	}

	public static void starter() {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.println("Current Calendar : a, Past Calendar : z");
			String input = reader.nextLine();
			
			if (input.isEmpty()) {
				break;
			}
			if (input.equals("a")) {
				buildCurrentCalendar();
			} else if (input.equals("z")) {
				int year = getYear();
                int month = getMonth();
                buildPastCalendar(year, month);
			} else {
				System.out.println("Type again");
				starter();
			}
		}
	}

	public static int getYear() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a year you want to print");
		int year = Integer.parseInt(reader.nextLine());
		if (year <= 0) {
			System.out.println("Please enter the year in natural numbers.");
			year = Integer.parseInt(reader.nextLine());
		}
		return year;
	}

	public static int getMonth() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a month you want to print");
		int month = Integer.parseInt(reader.nextLine());
		if (month <= 0 || month > 12) {
			System.out.println("Please enter the month as a natural number of 1 to 12.");
			month = Integer.parseInt(reader.nextLine());
		}
		return month;
	}
	
	public int[] getCurrent() {
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;
        int[] currentYearMonth = {currentYear, currentMonth};
		return currentYearMonth;
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void buildCurrentCalendar() {
		
		
	}

	private static void buildPastCalendar(int year, int month) {
		// TODO Auto-generated method stub
		
	}
}
