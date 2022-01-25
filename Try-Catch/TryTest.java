package TryCatch;

public class TryTest {
	public static void main(String[] args) {
		TryTest testtry = new TryTest();
		int num = 0;
		try {
			num = 5 / 0;
			testtry.shouldBeRun(num); // This code is not executed.
		} catch (ArithmeticException e){
			num = -1;
		} finally {
			testtry.shouldBeRun(num);
		}
	}

	public void shouldBeRun(int num) {
		System.out.println(num);
		System.out.println("Thank you");
	}
}
