package test;

import java.util.Scanner;

public class FibonacciTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("set a range ");
		int range = Integer.parseInt(reader.nextLine());
		
		for (int i = 0; i < range; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int num) {
		if (num <= 1) {
			return num;
		} else {
			// 예를 들어 5를 입력하면 0 1 1 2 3  이 나와야 하는데 
			// 1까지는 for문을 돌면서 그대로 출력 
			// 2부터는 0+1 로 1이 만들어 진 것이기 때문에
			// 0 + 1의 조건을 만들어 줘야 한다
			// 0은 입력받은 값의 -2 이고 1은 입력받은 값의 -1이다 
			// 이렇게 더해서 반환해주는 것이다
			return fibo(num - 2) + fibo(num - 1);
		}
	}
}
