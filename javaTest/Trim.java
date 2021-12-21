package test;

public class Trim {
	public static void main(String[] args) {
		String str = "  Hello, I'm on my way to work.  ";
		System.out.println(str);
		
		String strTrim = str.trim();
		System.out.println(strTrim);
	}
}
