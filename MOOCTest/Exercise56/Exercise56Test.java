package WEEK3;

import java.util.*;

public class Exercise56Test {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String word = "";
		System.out.print("Type in your text: ");
		String text = reader.nextLine();
		for (int i = text.length()-1; i >= 0; i--) {
			word += text.charAt(i);
		}
		System.out.println("In reverse order: " + word);
	}
}
