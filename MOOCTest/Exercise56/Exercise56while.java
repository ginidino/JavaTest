package WEEK3;

import java.util.*;

public class Exercise56while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type in your text: ");
			String text = reader.nextLine();
			if (text.isEmpty()) {
				break;
			}
			System.out.println("In reverse order: " + reverse(text));
		}
	}

	public static String reverse(String text) {
		String word = "";
		for (int i = text.length()-1; i >= 0; i--) {
			word += text.charAt(i);
		}
		return word;
	}
}
