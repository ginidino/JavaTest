package testjava;

import java.util.Scanner;

public class strSum {
	public static void main(String[] args) {
		//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 드를 완성하라.
		// 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다.
		// (1)에 알맞은 코드를 넣으시오.
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");
		String num = reader.nextLine();
		
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
