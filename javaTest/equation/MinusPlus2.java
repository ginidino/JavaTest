package testjava;

import java.util.Scanner;

public class MinusPlus2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int range = Integer.parseInt(reader.nextLine());
		int sum=0;
        int num=0;
 
        while (sum < range) {
            ++num;
            if (num % 2 == 0) {
            	sum -= num;
            } else {
            	sum += num;
            	System.out.println("num= " + num + " sum= " + sum); // 과정을 볼 수 있다
            }
        }
        System.out.println(num + "일 때, 총합이 " + sum + "이 된다.");
	}
}
