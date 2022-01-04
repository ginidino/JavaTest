package distribution;

import java.util.*;

public class Grade {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		int score = 0;
		int count0s = 0;
		int count1s = 0;
		int count2s = 0;
		int count3s = 0;
		int count4s = 0;
		int count5s = 0;
		
		double accepted = 0.0;
		double sum = 0;
		
		System.out.println("Type the exam scores, -1 completes:");
		while (score != -1) {
			score = Integer.parseInt(reader.nextLine());
			
			if (score >= 0 && score <= 60) {
				grades.add(score);
			}
		}
		System.out.println("Grade distribution:");
		
		for (int sco : grades) {
			if (sco < 30) {
				count0s++;
			} else if (sco < 35) {
				count1s++;
			} else if (sco < 40) {
				count2s++;
			} else if (sco < 45) {
				count3s++;
			} else if (sco < 50) {
				count4s++;
			} else {
				count5s++;
			}
		}
		for (int gra : grades) {
			if (gra >= 30) {
				sum++;
			}
		}
		if(count1s + count2s + count3s + count4s + count5s > 0) {
			accepted = 100 * sum / (grades.size());
		}
		
		System.out.print("5: ");
		for (int i = 0; i < count5s; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("4: ");
		for (int i = 0; i < count4s; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("3: ");
		for (int i = 0; i < count3s; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("2: ");
		for (int i = 0; i < count2s; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("1: ");
		for (int i = 0; i < count1s; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("0: ");
		for (int i = 0; i < count0s; i++) {
			System.out.print("*");
		}
		System.out.println("");
        System.out.println("Acceptance percentage: " + accepted);
	}
}
