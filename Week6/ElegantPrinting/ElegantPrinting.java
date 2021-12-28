package test;

public class ElegantPrinting {
	public static void main(String[] args) {
		int[] num = {5, 1, 3, 4, 2};
		for (int i = 0; i < num.length - 1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[num.length-1]);
	}
}
