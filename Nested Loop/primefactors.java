package Nested_Loop;

import java.util.Scanner;

public class primefactors {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(reader.nextLine());
		primeFactors(num);
	}

	public static void primeFactors(int num) {
		while (num % 2 == 0) {
			System.out.print(2 + " ");
			num /= 2;
		}
	}
}
