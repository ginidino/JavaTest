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

	public void starter() {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.println("Current Calendar : a, Past Calendar : z, Exit : Enter");
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
	
	public static boolean isLeapYear(int year) {
		if ((year % 4) == 0 && (year % 100) !=0 || (year % 100) == 0 && (year % 400) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int calMonth1stDayWeek(int year, int month) {
		Calendar cal = Calendar.getInstance();
		Date time = new Date();
		String YMD = year + "-" + month + "-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(time);
		System.out.println("<Tday's date is " + today);
		try {
			cal.setTime(sdf.parse(YMD));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		int day = cal.get(Calendar.DAY_OF_WEEK);
		// 1(Sun) 2(Mon) 3(Tue) 4(Wed) 5(Thu) 6(Fri) 7(Sat)
		return day;
	}

	public static void buildCurrentCalendar() {
		//(By the default, print the calendar of the current date.)
        // 1. decision year, month
		int year = cal.getCurrent()[0];
		int month = cal.getCurrent()[1];
		// 2.Decision maximum day in month (Leap year test in February, maximum day array = dayDataLeapYear in leap year)
		int dayMax = 0;
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dateLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean leap = isLeapYear(year);
		if (month == 2 && leap == true) { // February and leap year
			dayMax = dateLeapYear[month - 1];
		} else if (month == 2 && leap == false) { // February, but not leap year
			dayMax = date[month - 1];
		} else { // // not February
			dayMax = date[month - 1];
		}
		// 3. Calculate the day of the week on the first day of the month
		int dayWeek1 = calMonth1stDayWeek(year, month); // Day of the 1st of the current month
		// 4. print in the calendar format - printCalendar
		printCalendar(year, month, dayMax, dayWeek1);
	}

	public static void buildPastCalendar(int year, int month) {
		// When the year and month are input, print the calendar of the year and month
		// 1. decision year, month = take as parameter
		// Decision maximum day in month (Leap year test in February, maximum day array = dayDataLeapYear in leap year)
		int dayMax = 0;
		int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dateLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		boolean leap = isLeapYear(year);
		if (month == 2 && leap == true) { // February and leap year
			dayMax = dateLeapYear[month - 1];
		} else if (month == 2 && leap == false) { // February, but not leap year
			dayMax = date[month - 1];
		} else { // // not February
			dayMax = date[month - 1];
		}
		// 3. Calculate the day of the week on the first day of the month
		int dayWeek1 = calMonth1stDayWeek(year, month); // Day of the 1st of the current month
		// 4. print in the calendar format - printCalendar
		printCalendar(year, month, dayMax, dayWeek1);
	}
	
	public static void printCalendar(int year, int month, int dayMax, int dayWeek1) {
	// print first day ~ maximum day of the month
	System.out.println(year + "\n" + " =============== " + month + " ===============");
        System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat  ");
        for (int i = 1; i < dayWeek1; i++) {
			System.out.print("   * ");
		}
		for (int j = 1; j <= dayMax; j++) {
			if (j < 10) {
				System.out.print("   " + j + " ");
			} else {
				System.out.print("  " + j + " ");
			}
			if ((dayWeek1 - 1 + j) % 7 == 0) { // blank = (dayWeek1 - 1) + i -> a week in one line
				System.out.println();
			}
		}
		System.out.println("\n");
	}
}
