package test;

import java.util.Scanner;

public class ArrayMean2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] num = new int[4];
		int sum = 0;
		boolean isSend = false;
		System.out.println("Enter the number[0-100]: ");
		
		for (int i = 0; i < num.length; i++) {
			if (isSend == true) {
				num[i] = 0;
			} else {
				String grade = reader.nextLine();
				if (grade.isEmpty()) {
					isSend = true;
					num[i] = 0;
				}else {
					num[i] = Integer.parseInt(grade);
				}
			}
			sum += num[i];
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + ": " + num[i]);
		}
		
		double result = (double) sum / num.length;
		System.out.println("mean is: " + result);
	}
}
