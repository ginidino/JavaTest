package Nested_Loop;

import java.util.Scanner;

public class primefactors {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type a number: ");
			int num = Integer.parseInt(reader.nextLine());
			if (num == 1) {
				break;
			}
			
			while (num % 2 == 0) {
				System.out.print(2 + " ");
				num /= 2;
			}
			for (int i = 2; i < Math.sqrt(num); i++) {
				while (num % i == 0) {
					System.out.print(i + " ");
					num /= i;
				}
			}
			if (num >= 2) {
				System.out.println(num);
			}
		}
	}
}
