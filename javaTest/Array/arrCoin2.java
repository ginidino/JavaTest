package testjava;

import java.util.Scanner;

public class arrCoin2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the money: ");
		int price = Integer.parseInt(reader.nextLine());
		int[] coin = {500, 100, 50, 10};
		int[] numCoin = {5, 5, 5, 5};
		
		for (int i = 0; i < coin.length; i++) {
			int CoinNum = 0;
			CoinNum = price / coin[i];
			
			if (numCoin[i] >= CoinNum) {
				numCoin[i] -= CoinNum;
			} else {
				CoinNum = numCoin[i];
			}
			price = price - coin[i] * CoinNum;
			System.out.println(coin[i] + "₩: " + CoinNum);
		}
		if (price > 0) {
			System.out.println("거스름돈이 부족합니다 ");
			System.exit(0);
		}
		System.out.println("= 남은 동전의 개수 =");
		
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "₩: " + numCoin[i]);
		}
	}
}
