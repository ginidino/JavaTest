package Shuffling;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflingTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		System.out.println(list);
	}
}
