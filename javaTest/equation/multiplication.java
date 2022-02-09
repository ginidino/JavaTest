package test;

public class multiplication {
	public static void main(String[] args) {
		System.out.format("%n <multiplication table>%n");
		for (int j = 1; j <= 9; j++) {
			System.out.println();
			for (int i = 2; i <= 5; i++) {
				System.out.format("%d X %d  ", i, j, i * j);
			}
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			System.out.println();
			for (int i = 6; i <= 9; i++) {
				System.out.format("%d X %d = %2d     ", i, j, i * j);
			}
		}
		System.out.println();
		for (int j = 1; j <= 9; j++) {
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				System.out.format("%d X %d = %2d     ", i, j, i * j);
			}
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + (i * j) + "	");
			}
			System.out.println();
		}
	}
}
