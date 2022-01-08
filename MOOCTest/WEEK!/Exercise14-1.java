import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.print("Type a number: ");
			int num = Integer.parseInt(reader.nextLine());
			if (num == 0) {
				break;
			}
			positive(num);
		}
	}

	private static void positive(int num) {
		if (num > 0) {
			System.out.println("The number is positive.");
		} else {
			System.out.println("The number is not positive.");
		}
	}
}
