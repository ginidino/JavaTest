package Grade;

import java.util.Scanner;

public class MeanGrade {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] grade = new int[4];
		
		for (int i = 0; i < grade.length; i++) {
			System.out.println("enter your grade");
			String input= reader.nextLine();
			if (input.length() == 0) {
				grade[i] = 0;
			} else {
				grade[i] = Integer.parseInt(input);
			}
			
			if (isValid(grade[i])==false) {
				grade[i] = 0;
				break;
			}
		}
		double result = computeMean(grade);
		System.out.println("mean is: " + result);
		
		for (int j = 0; j < grade.length; j++) {
			System.out.println("score "+ grade[j]);
		}
	}

	public static boolean isValid(int grade) {
		if (grade >= 0 && grade <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double computeMean (int[] grade) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] >= 0 || grade[i] <= 100) {
				sum += grade[i];
				count++;
			}
		}
		return (double) sum / count;
	}
}
