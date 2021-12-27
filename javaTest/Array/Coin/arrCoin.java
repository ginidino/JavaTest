package testjava;

import java.util.Scanner;

public class arrCoin {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] coin = {500, 100, 50, 10};
		System.out.print("Enter the money: ");
		int money = Integer.parseInt(reader.nextLine());
		System.out.println("money= " + money);
		for (int i = 0; i < coin.length; i++) {
			int count = money / coin[i];
			System.out.println(coin[i] + "₩: " + count);
			money = money - count * coin[i];
		}
	}
}
