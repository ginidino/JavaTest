package testjava;

import java.util.Scanner;

public class equation2 {
	public static void main(String[] args) {
		// calculate 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int range = Integer.parseInt(reader.nextLine());
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.printf("%d",j);  //잘 더해지고 있는지 볼 수 있다
			}
			System.out.println();
		}
		System.out.println("sum= " + sum);
	}
}
