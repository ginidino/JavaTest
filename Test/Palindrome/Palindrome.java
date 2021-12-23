package test;

import java.util.*;

public class Palindrome {
	public static boolean palindrome(String text) {
	   int len = text.length();
	   for (int i = 0; i < len; i++) {
		   if (text.charAt(i) != text.charAt(len-i-1)) {
			   return false;
		   }
	   }
	   return true;
	}

	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Type a text: ");
	    String text = reader.nextLine();
	    if (palindrome(text)) {
	       System.out.println("The text is a palindrome!");
	    } else {
	       System.out.println("The text is not a palindrome!");
	    }
	}
}
