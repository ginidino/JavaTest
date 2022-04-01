package distribution;

import java.util.*;

public class TestGradeDistribution {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] grades = new int[6];
		System.out.println("Type the exam scores [0-60], -1 completes:");
		while (true) {
			int score = Integer.parseInt(reader.nextLine());
			if (score == -1) {
				break;
			}
			if (score >= 0 && score <= 60) {
				int theGrade = 0;
				if (score < 30)  {
					grades[theGrade] = 0;
				} else if (score < 35) {
					grades[theGrade]++;
				} else if (score < 40) {
					grades[theGrade]++;
				} else if (score < 45) {
					grades[theGrade]++;
				} else if (score < 50) {
					grades[theGrade]++;
				} else {
					grades[theGrade]++;
				}
			}
		}
		System.out.println("Grade distribution:");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i + ": " + stars(grades[i]));
		}
		System.out.println("Acceptance percentage: " + acceptancePercentage(grades));
	}

	private static String stars(int n) {
		String star = "";
		for (int i = 0; i < n; i++) {
			star += "*";
		}
		return star;
	}
	
	private static double acceptancePercentage(int[] grades) {
		// formula: 100 * accepted / allScore
		double all = 0;
		for (int num : grades) {
			all += num;
		}
		double failed = grades[0];
		return 100 * (all - failed) / all;
	}
}
