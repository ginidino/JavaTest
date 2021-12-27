package testjava;

import java.util.Scanner;

public class distinguish {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a word ");
		String word = reader.nextLine();
		boolean boo = false;
		
		for (int i = 0; i < word.length(); i++) {
			if(!Character.isDigit(word.charAt(i))) {
				boo = false;
			} else {
				boo = true;
			}
		}
		System.out.println(boo);
	}
}
