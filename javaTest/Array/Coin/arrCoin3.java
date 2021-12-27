package testjava;

import java.util.Scanner;

public class arrCoin3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int price = 0;
		while (true) {
			System.out.print("Total price : ");
			price = Integer.parseInt(reader.nextLine());
			
			if(price > 1000000) {
                System.out.println("Enter the money less than 1,000,000₩");
            } else if(price < 100) {
                System.out.println("Enter the money more than 100₩");
            } else {
                break;
            }
		}
		System.out.println("Change: " + price + "₩");
		
		int[] arr = {10000, 5000, 1000, 500, 100};
		for (int i = 0; i < arr.length; i++) {
			if(price / arr[i] > 0) {
				System.out.println(arr[i] + "₩: " + price / arr[i]);
			}
		}
	}
}
