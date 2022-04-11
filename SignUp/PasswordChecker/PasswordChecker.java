package SignUp;

import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = reader.nextLine();
		
		System.out.println(checkPassword(password));
	}

	public static String checkPassword(String password) {
		String ret = ""; // initialize empty string
		// whenever some condition is not satisfied, append that reason to String ret
		if (password.length() < 8) {
			ret += "password must be atleast 8 characters\n";
		} else if (password.length() > 12) {
			ret += "password can be atmost 12 characters\n";
		}
		if (Character.isDigit(password.charAt(0))) {
			ret += "password can not start with digit\n";
		}
		
		boolean alhpanumeric = true;
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetter(password.charAt(i)) || password.charAt(i) == '_') {
				alhpanumeric = false;
			} else if (Character.isUpperCase(password.charAt(i))) {
				hasUppercase = true;
			} else if (Character.isLowerCase(password.charAt(i))) {
				hasLowercase = true;
			}
		}
		if(!alhpanumeric) {
			ret += "password can only contain alphabetic characters, digits or underscore\n";
		} else if (!(hasLowercase && hasUppercase)) {
			ret += "password should be a mix of uppercase and lowercase\n";
		}
		
		// if at this point String ret is still empty, that means valid
		if (ret == "") {
			ret = "OK"; // change it to OK
		}
		return ret;
	}
}
