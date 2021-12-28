package test;

public class ElegantPrinting2 {
	public static void main(String[] args) {
		int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i == num.length - 1) {
				break;
			} else {
				System.out.print(", ");
			}
		}
	}
}
