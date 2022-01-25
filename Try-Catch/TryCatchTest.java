package TryCatch;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			int[] num = new int[3];
			System.out.println("num 배열의 최대 길이는 3입니다.");
	        
            num[4] = 0;
            System.out.println("num[4] 에 값을 입력했습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이가 맞지 않습니다.");
		} finally {
			System.out.println("배열을 다시 선언합니다");
            int [] num = new int[5];
            
            num[4] = 0;
            
            System.out.println(num[4]);
		}
		System.out.println("프로그램을 종료합니다");
	}
}
