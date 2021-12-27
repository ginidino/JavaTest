package testjava;

import java.util.Scanner;

public class distinguish3 {
	public static void main(String[] args) {
		// 입력된 문자열이 숫자인지 문자가 섞여있는지 판단하는 코드를 작성
		char temp = 0;
		boolean flag = true;
		// 문자열 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 > ");
		String str = scn.next();
		
		for(int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);				// 입력한 str을 문자로 쪼개서 temp로 받기
			if (temp < '0' || temp > '9') {		// temp의 값이 '0'작거나 '9'보다 클 경우
				flag = false;
				break;
			}	
		}
		if (flag == true) {	
			System.out.println("숫자로 되어있습니다.");
		}else {
			System.out.println("문자열입니다.");
		}
	}
}
