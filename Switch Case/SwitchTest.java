package SwitchCase;

import java.util.*;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a month");
		int month = Integer.parseInt(reader.nextLine());
		int day = 31;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day += 0;
			break;
		case 2:
			day -= 3;
			break;
		case 4: case 9: case 11:
			day -= 1;
			break;
		default:
			System.out.println("error");
			day = 0;
			break;
		}
		System.out.println(month + "월은 "+ day + "까지 있습니다.");
	}
}
