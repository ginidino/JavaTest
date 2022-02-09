package Calendar;

import java.util.Scanner;

public class Calendar3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while(true) {
			System.out.print("Type a year: ");
			int year = Integer.parseInt(reader.nextLine());
			System.out.print("Type a month: ");
			int month = Integer.parseInt(reader.nextLine());
			System.out.println();
			System.out.println(year + ", " + month);
			
			if (year < 1583) {
				break;
			}
			int sum = 0;
			
			for (int i = 0; i < year; i++) {
				if ((year % 4) == 0 && (year % 100) !=0) {
					sum += 2; // leap year
				} else if ((year % 100) == 0 && (year % 400) == 0) {
					sum += 2; // leap year
				} else {
					sum += 1;
				}
			}
			int dayFirst = (sum + 6) % 7;
			
			for (int j = 0; j < month; j++) {
				dayFirst += monthDay(year, j) % 7;
			}
			int day = dayFirst % 7; // 입력한 month의 1일의 요일
			int num = 1; // month의 일 표시
			int maxDate = monthDay(year, month); // 해당 month가 가지는 최대 일 수
			boolean start = false;

			System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
			for (int row = 0; row <= 5; row++) {
				for (int column = 0; column <= 6; column++) {
					if (row == 0 && !start) {
						// 달력의 첫 행
						if (column == day) {
							// 시작 일에 도달하면
							start = true;
						} else {
							// 시작 일에 도달 전에는 공백
							System.out.print("     ");
							continue;
						}
					}
					System.out.printf("  %02d ", num);
					num++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static int monthDay(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if ((year % 4) == 0 && (year % 100) !=0 || (year % 100) == 0 && (year % 400) == 0) {
			return 29;
		} else {
			return 28;
		}
	}
}
