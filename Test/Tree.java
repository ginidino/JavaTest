package test;

public class Tree {
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
		int height1 = 2;
		for (int z = 1; z <= height1; z++) {
			//print indentation
			for (int spaces = 1; spaces <= height-2; spaces++) {
				System.out.print(" ");
			}
			//prints square
			int stand = 3;
			for (int i = 1; i <= stand-2; i++) {
				for (int j = 1; j <= stand; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
	}
}
