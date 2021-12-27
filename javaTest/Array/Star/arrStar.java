package testjava;

public class arrStar {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] count = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			count[answer[i] - 1]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]);
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
