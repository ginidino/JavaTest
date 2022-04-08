package Grade;

import java.util.Scanner;

public class resultchecker2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] grades=new int[9];
		for(int i = 0; i < grades.length - 1; i++) {
			System.out.print("Enter grade for module " + (i + 1) + " : ");
			grades[i] = Integer.parseInt(reader.nextLine());
		}
		System.out.print("Enter project mark : ");
		grades[grades.length - 1] = Integer.parseInt(reader.nextLine());
		System.out.println(getResult(grades));
	}

	public static String getResult(int[] grades) {
		double mean = computeMean(grades);
		System.out.println("Mean : " + mean);
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 0 || grades[i] > 100) {
				return "ERROR";
			} else if (mean < 40) {
				return "FAIL";
			} else if (mean < 50 || grades[grades.length - 1] < 50) {
				return "PASS";
			} else if(mean < 70 || grades[grades.length - 1] < 70) {
				return "MERIT";
			} else if(mean >= 70 || grades[grades.length - 1] >= 70) {
				return "DISTINCTION";
			}
		}
		return "";
	}
	
	public static double computeMean(int[] grade) {
		int sum = 0;
		for (int num : grade) {
			sum += num;
		}
		return (double) sum / 8;
	}
}
