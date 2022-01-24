package SwitchCase;

import java.util.Scanner;

public class month {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a month");
		int month = Integer.parseInt(reader.nextLine());
		switch(month) { 
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("until 31th"); 
			break; 
		case 4: case 6: case 11: 
			System.out.println("until 30th"); 
			break; 
		default: System.out.println("until 28th"); 
			break; 
		}
	}
}
