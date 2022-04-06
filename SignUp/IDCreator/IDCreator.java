package SignUp;

import java.util.Scanner;

public class IDCreator {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		String[] partOfName = name.split(" ");
		String createdId = "";
		
		if (partOfName.length == 2 || partOfName.length == 3) {
			createdId = "";
		}
		for (int i = 0; i < partOfName.length; i++) {
			String part = partOfName[i];
			if (partOfName.length == 2 && i == 1) {
				createdId += "x";
			}
			createdId += part.charAt(0);
		}
		createdId = createdId.toLowerCase();
		
		System.out.println(createdId);
	}
}
