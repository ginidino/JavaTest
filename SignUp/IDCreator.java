package SignUp;

import java.util.Scanner;

public class IDCreator {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		String[] partOfName = name.split(" ");
		
		System.out.print(Character.toLowerCase(name.charAt(0)));
		
		for(int i = 1; i < name.length() - 1; i++) {
			if (name.charAt(i) == ' ') {
				System.out.print(Character.toLowerCase(name.charAt(i + 1)));
			}
		}
	}
}
