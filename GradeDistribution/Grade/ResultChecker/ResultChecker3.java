package Grade;

import java.util.Scanner;

public class ResultChecker3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] grades = new int[9];
		
		for (int i = 0; i < grades.length; i++) {
			if (i != 8) {
				System.out.print("Module " + (i + 1) + " : ");
				grades[i] = Integer.parseInt(reader.nextLine());
			}
			if (i == 8) {
				System.out.print("Project Mark : ");
				grades[i] = Integer.parseInt(reader.nextLine());
			}
		}
		System.out.println(getResult(grades));
	}
	
	public static String getResult(int[] grades) {
		double mean = computeMean(grades);
		int projectValue = 0;
		System.out.println("Mean: " + mean);
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println((i + 1) + " : " + grades[i]);
			int grade = grades[i];
			projectValue = grades[8];
			
			if (!isValid(grade)) {
				return "ERROR";
			} else if (isValid(grade) && (mean<40 || grade<40)) {
				return "FAIL";
			} else if (mean <50 || projectValue<50) {
				return "PASS";
			} else if (mean<70 || projectValue<70) {
				return "MERIT";
			} else if  (mean >= 70 && projectValue>=70) {
				return "DISTINCTION";
			}
		}
		
		return "";
	}
	
	public static boolean isValid(int grade) {
		if (grade >= 0 && grade <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double computeMean(int[] grades) {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 0 || grades[i] <= 100) {
				sum += grades[i];
			} else {
				break;
			}
		}
		return (double) sum / 8;
	}
}
