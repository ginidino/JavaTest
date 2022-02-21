package Nested_Loop;

public class product {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.println( i + " X " + j + " = " + (i * j));
			}
		}
		System.out.println();
		breakloop();
	}

	public static void breakloop() {
		loop:
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i == 3) {
					break loop;
				}
				System.out.println( i + " X " + j + " = " + (i * j));
			}
		}
	}
}
