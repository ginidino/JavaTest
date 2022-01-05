package distribution;

import java.util.*;

public class GradeTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.print("Type the points [0-60]: ");
			int grade = Integer.parseInt(reader.nextLine());
			
			if (grade == -1) {
				break;
			}
			
			if (grade < 30) {
				System.out.println("Grade: failed");
			} else if (grade > 29 && grade < 35) {
				System.out.println("Grade: 1");
			} else if (grade > 34 && grade < 40) {
				System.out.println("Grade: 2");
			} else if (grade > 39 && grade < 45) {
				System.out.println("Grade: 3");
			} else if (grade > 44 && grade < 50) {
				System.out.println("Grade: 4");
			} else
				System.out.println("Grade: 5");
		}
	}
}
