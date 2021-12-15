package test;

import java.util.Scanner;
import java.util.Random;

public class guessingNum {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		int numDraw = random.nextInt(101);
		
		int made = 0;
		while(true) {
			System.out.print("Guess a number: ");
			int guess = Integer.parseInt(reader.nextLine());
			made++;
			
			if (guess == numDraw) {
				break;
			} else if (guess < numDraw) {
				System.out.println("The number is greater, guesses made: " + made);
			} else {
				System.out.println("The number is lesser, guesses made: " + made);
			}
		}
		System.out.println("Congratulations, your guess is correct!");
	}
}
