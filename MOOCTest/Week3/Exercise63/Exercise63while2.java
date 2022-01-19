package Test;

import java.util.*;

public class Exercise63while2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Type numbers");
		
		while (true) {
			int num = Integer.parseInt(reader.nextLine());
			
			list.add(num);
			
			if (list.size() == 4) {
				break;
			}
		}
		System.out.println(list);
		System.out.println(sum(list));
		System.out.println();
		if (list.size() == 4) {
			int num = Integer.parseInt(reader.nextLine());
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
