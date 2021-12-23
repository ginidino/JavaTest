package testjava;

import java.util.Scanner;

public class MinusPlus {
	public static void main(String[] args) {
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나가
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int range = Integer.parseInt(reader.nextLine());
		int num = 0;
		int x = 1; // 값의 부호를 바꿔주는데 사용하는 변수
		int sum = 0;
		
		for (int i = 1; i <= range; i++, x = -x) {
			num = i * x; // 부호 바꾸기
			sum += num;
		}
		System.out.println(num);
        System.out.println(sum);
	}
}
