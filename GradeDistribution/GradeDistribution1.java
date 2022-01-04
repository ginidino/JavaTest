package distribution;

import java.util.Scanner;
import java.util.ArrayList;

public class GradeDistribution1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<Integer>();
		System.out.println("Type the exam scores, -1 completes:");
		while (true) {
			int score = Integer.parseInt(reader.nextLine());
			if (score == -1) {
				break;
			}
			if (score >= 0 && score <= 60) {
				grades.add(score);
			}
		}
		double sum = 0;
		System.out.println("Grade distribution:");
		for (int i = 5; i >= 0; i--) {
			System.out.print(i + ":");
			for (int sco : grades) {
				if(sco > 49 && i == 5) {
					System.out.print("*");
					sum++;
				} else if (sco < 50 && sco > 44 && i == 4) {
					System.out.print("*");
					sum++;
				} else if (sco < 45 && sco > 39 && i == 3) {
					System.out.print("*");
					sum++;
				} else if (sco < 40 && sco > 34 && i == 2) {
					System.out.print("*");
					sum++;
				} else if (sco < 35 && sco > 29 && i == 1) {
					System.out.print("*");
					sum++;
				} else if (sco < 30 && i == 0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		double accepted = (100 * sum) / grades.size();
		System.out.println("Acceptance percentage:" + accepted + "%");
	}
}
