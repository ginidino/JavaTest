package testjava;

import java.util.Scanner;

public class FibonacciTest2 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int range = reader.nextInt();
        
        
        int num1=0; // 첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
        int num2=1; // 1로 준다
        int sum=1; // 첫번째 1은 그냥 초기값으로 설정
        
        for(int i = 0; i < range; i++) {
            System.out.print(sum + " ");
            sum = num1 + num2; // 두 값을 더한 후
            num1 = num2;
            num2 = sum; // 두번째 연산자에 더한 값을 넣어준다.
        } 
	}
}