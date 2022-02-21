package Nested_Loop;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("How long is the line? : ");
		int row = Integer.parseInt(reader.nextLine());
		
		for (int i = row; i >0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
