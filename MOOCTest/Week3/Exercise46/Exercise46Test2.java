package Test;

public class Exercise46Test2 {
	public static void main(String[] args) {
	    double answer = average(4, 3, 6, 1);
	    System.out.println("average: " + answer);
	}

	public static double average(int num1, int num2, int num3, int num4) {
		int sum = num1 + num2 + num3 + num4;
		double average = (double) sum / 4;
		return average;
	}
}
