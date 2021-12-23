package test;

import java.util.*;

public class Palindrometest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type a text: ");
	    String text = reader.nextLine();
	    
	    int len = text.length();
	    boolean boo = true;
	    for (int i = 0; i < len; i++) {
	    	if (text.charAt(i) != text.charAt(len-i-1)) {
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
