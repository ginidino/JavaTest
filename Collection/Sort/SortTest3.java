package Sort;

import java.util.*;

public class SortTest3 {
	public static void main(String[] args) {
		String[] example = {"Nice", "to", "meet", "you"};
		List<String> list = Arrays.asList(example);
		Collections.sort(list, Collections.reverseOrder()); // 리스트 역순정렬
		System.out.println(list);
	}
}
