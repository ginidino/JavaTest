package Searching;

import java.util.*;

// binary search
public class SearchingTest {
	public static void main(String[] args) {
		String key1 = "ssds";
		String key2 = "abc";
		String[] param = {key1, key2};
		List<String> list = Arrays.asList(param);
		Collections.sort(list);
		
		for (String s : list) {
			System.out.println(s);
		}
		int pos = Collections.binarySearch(list, key2);
		System.out.println(pos);
	}
}
