package testjava;

import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int range = Integer.parseInt(reader.nextLine());
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2);
		
		for (int i = 0; i < range; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			
			num1 = num2;
			num2 = num3;
		}
	}
}
