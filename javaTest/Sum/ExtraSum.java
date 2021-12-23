package testjava;

import java.util.*;

public class ExtraSum {
	public static void main(String[] args) {
		//int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
	    // 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
	    // (1) 에 알맞은 코드를 넣으시오.
		Scanner reader = new Scanner(System.in);
		System.out.println("Write down the number");
		int num = Integer.parseInt(reader.nextLine());
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
