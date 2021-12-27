package testjava;

public class arrRandom {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			int j = (int) Math.random() % arr.length;
			int tmp = 0;
			
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		for (int i = 0; i < 3; i++) {
			ball3[i] = arr[i];
		}
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
