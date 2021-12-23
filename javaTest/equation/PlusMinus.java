package testjava;

public class PlusMinus {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		while(true) {
			num++;
			if(num % 2 == 0) {
				sum -= num;
			} else {
				sum += num;
				System.out.println("num= " + num + " sum= " + sum); 
			}
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(num + "일 때, 총합이 " + sum + "이 된다.");
	}
}
