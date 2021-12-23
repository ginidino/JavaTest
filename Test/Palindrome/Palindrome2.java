package test;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Type a word: ");
			String word = sc.nextLine();
			boolean boo = true;
			if (word.isEmpty()) {
				break;
			}
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
					boo = false;
				}
			}
			
			if (boo == true) {
		    	System.out.println("The text is a palindrome!");
		    } else {
		    	System.out.println("The text is not a palindrome!");
		    }
		}
	}
}
