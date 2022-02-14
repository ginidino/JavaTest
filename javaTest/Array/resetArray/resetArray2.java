package test;

public class resetArray2 {
	public static void main(String[] args) {
		int[] value = {1, 2, 3, 4, 5};
		for (int num : value) {
			System.out.print(num + " "); // prints: 1, 2, 3, 4, 5
		}
		System.out.println();
		
		resetArray(value);
		for (int num : value) {
			System.out.print(num + " "); // prints: 0, 0, 0, 0, 0
		}
	}

	public static void resetArray(int[] table) {
		for (int i = 0; i < table.length; i++) {
			table[i] = 0;
		}
	}
}
