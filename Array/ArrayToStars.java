package test;

public class ArrayToStars {
	public static void main(String[] args) {
		// using for each loop
		int[] array = {5, 1, 3, 4, 2};
		for (int star : array) {
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
