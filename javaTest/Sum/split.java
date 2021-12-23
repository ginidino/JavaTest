package testjava;

public class split {
	public static void main(String[] args) {
		String str = "ginidino@gmail.com";
		String[] strArray = str.split("@");
		
		for (String s : strArray) {
			System.out.println(s);
		}
		System.out.println();
		// '.'으로 나눌 경우
		String[] strAr = str.split("\\.");
		for (String n : strAr) {
			System.out.println(n);
		}
		// 구분자를 여러개 두고 싶을 경우 -> '|'을 사
		System.out.println();
		String[] strarray = str.split("@|\\.");
		for (String i : strarray) {
			System.out.println(i);
		}
	}
}
