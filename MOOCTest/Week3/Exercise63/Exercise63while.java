package Test;

import java.util.*;

public class Exercise63while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type numbers");
		while(true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num < 0) {
				break;
			}
			list.add(num);
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println(sum(list));
		System.out.println();
		
		while(true) {
			int num = Integer.parseInt(reader.nextLine());
			if (num < 0) {
				break;
			}
			list.add(num);
		}
		System.out.println(list);
		System.out.println(sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}
}
