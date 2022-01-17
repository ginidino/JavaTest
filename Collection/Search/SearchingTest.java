package Searching;

import java.util.*;

public class SearchingTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        
        int index = Collections.binarySearch(list, 10);
        System.out.println(index);
        
        index = Collections.binarySearch(list, 4);
        System.out.println(index);
	}
}
// print 3
//       -4