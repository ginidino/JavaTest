package test;

import java.util.Scanner;

public class Palindrome3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type a word: ");
			String word = reader.nextLine();
			int len = word.length();
			boolean boo = true;
			
			for (int i = 0; i < len; i++) {
				if (word.charAt(i) != word.charAt(len - i - 1)) {
					boo = false;
				}
			}
			
			if (boo == true) {
		    	System.out.println("The text is a palindrome!");
		    } else {
		    	System.out.println("The text is not a palindrome!");
		    	break;
		    }
		}
	}
}
