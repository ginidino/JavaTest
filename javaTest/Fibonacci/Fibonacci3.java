package testjava;

import java.util.Scanner;

public class Fibonacci3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int num = Integer.parseInt(reader.nextLine());
		System.out.println(fibo(num));
	}

	public static int fibo(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 1;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}
}
