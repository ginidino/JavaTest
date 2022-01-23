package test;

import java.util.*;

public class LoopsEndingRemembering {
	public static void main(String[] args) {
		// 36.1 Reading numbers
		// 36.2 The sum of the numbers without -1
		// 36.3 Summing and counting the numbers without -1
		// 36.4 Counting the average without -1
		// 36.5 Even and odd numbers without -1
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int even = 0;
		int odd = 0;
		double average = 0;;
		
		System.out.println("Type numbers: ");
		while (true) {
			int num = reader.nextInt();
			if (num == -1) {
				break;
			}
			sum += num;
			count++;
			average = (double) sum / count;
			
			if(num % 2 == 0) {
				even++;
			} else if (num % 2 != 0) {
				odd++;
			}
		}
		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " + sum);
		System.out.println("How many numbers: " + count);
		System.out.println("Average: " + average);
		System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
	}
}
