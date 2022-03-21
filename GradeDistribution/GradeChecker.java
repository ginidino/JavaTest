package Grade;

import java.util.Scanner;

public class GradeChecker {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a grade [0-100] ");
		int grade = Integer.parseInt(reader.nextLine());
		if (isValid(grade) == true) {
			if (isPass(grade) == true) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	public static boolean isValid(int grade) {
		if (grade >= 0 && grade <= 100) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPass(int grade) {
		if (grade >= 40) {
			return true;
		} else {
			return false;
		}
	}
}
