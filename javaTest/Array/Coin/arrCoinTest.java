package testjava;

import java.util.*;

public class arrCoinTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int price = 0;
		while (true) {
			System.out.print("Enter the money: ");
			price = Integer.parseInt(reader.nextLine());
			if(price > 1000000) {
                	System.out.println("Enter the money less than 1,000,000₩");
            		} else if(price < 100) {
                		System.out.println("Enter the money more than 100₩");
            		} else {
               		 	break;
            		}
		}
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10};
		int[] MaxNum = {5, 5, 5, 5, 5, 5, 5};
		int coinNum = 0;
		
		for (int i = 0; i < coin.length; i++) {
			coinNum = price / coin [i];
			
			if (MaxNum[i] >= coinNum) {
				MaxNum[i] -= coinNum;
			} else {
				coinNum = MaxNum[i];
				MaxNum[i] = 0;
			}
			price = price - coin[i] * coinNum;
			System.out.println(coin[i] + "₩: " + coinNum);
		}
		if (price > 0) {
			System.out.println("lack of charge ");
		}
		System.out.println("= number of coins left =");
		
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "₩: " + MaxNum[i]);
		}
	}
}
