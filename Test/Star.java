package test;

import java.util.*;

public class Star {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("set a height: ");
		int height = Integer.parseInt(reader.nextLine());
		//System.out.println();
		System.out.print("set a root: ");
		int root = Integer.parseInt(reader.nextLine());
		System.out.println();
		
		for (int i = 1; i <= height; i++) {
			for (int space = 0; space < height-i; space++) {
				System.out.print(" ");
			}
			for(int star = 0; star < i*2-1; star++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//int height1 = 2;
		//int root_height = 2;
		for (int i = 0; i < root; i++) {
			for (int j = 0; j <= height; j++) {
				if (j == height-2 || j == height-1 || j == height) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
