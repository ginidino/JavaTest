package test;

public class Exercise {
	public static void main(String[] args) {
		// set height about triangle
		int height = 10;
		for (int i = 1; i <= height; i++) {
			//prints indentation
			for(int space = 1; space <= height-i; space++) {
				System.out.print(" ");
			}
			//prints star
			for(int star = 1; star <= i*2-1; star++) {
				System.out.print("*");
			}
			//prints new line
			System.out.println(" ");
		}
		//prints stand
		//set height about stand
		int root_height = 2;
		for (int i = 0; i < root_height; i++) {
			for (int j = 0; j <= height; j++) {
				if (j == height-2 || j == height-1 || j == height) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}

