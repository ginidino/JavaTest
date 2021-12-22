package testjava;

import java.util.Scanner;

public class Strsplit {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String num = reader.nextLine();
		int sum = 0;
		
		int num1 = Integer.parseInt(num);
		
		while (num1 > 0) {
			sum += num1 % 10;
			num1 /= 10;
		}
		System.out.println(sum);
	}
}
