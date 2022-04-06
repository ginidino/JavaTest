package SignUp;

import java.util.Scanner;

public class IDCreator2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		if (createID(name).isEmpty()) {
			System.out.println("Invalid input"); //show Id
		} else {
			System.out.println("Created Id : " + createID(name)); //show Id
		}
	}
	
	public static String createID(String name) {
		String createdId = "";
		if (name != null && !name.isEmpty()) { //verify the string
			String[] partOfName = name.split(" ");
			if (partOfName.length == 3) {
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
		}
		return createdId;
	}
}
