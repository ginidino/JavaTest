package testjava;

import java.util.Scanner;

public class splittest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		String numbers[] = input.split("\\s+");   // Split the input string.
		int sum = 0;
		for (String number : numbers) {  // loop through all the number in the string array
			Integer n = Integer.parseInt(number);  // parse each number
		    sum += n;     // sum the numbers
		}
		System.out.println(sum);  // print the result.
	}
}
