package test;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	public static void main(String[] args) {
		// 오름차순
		// int
		Integer[] array = {4,23,33,15,17,19};
		Arrays.sort(array);
		elegantPrint(array);
		
		// String
		String[] arr = {"apple","orange","banana","pear","peach","melon"};
		Arrays.sort(arr);
		elegantPrint(arr);
		
		// 내림차순
		// int
		Integer[] arrays = {4,23,33,15,17,19};
		Arrays.sort(arrays, Collections.reverseOrder());
		elegantPrint(arrays);
		
		// String
		Arrays.sort(arr, Collections.reverseOrder());
		elegantPrint(arr);
	}

	public static void elegantPrint(Integer[] arrays) {
		for (int i = 0; i < arrays.length - 1; i++) {
			System.out.print(arrays[i] + ", ");
		}
		System.out.print(arrays[arrays.length-1]);
		System.out.println();
	}
	
	public static void elegantPrint(String[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length-1]);
		System.out.println();
	}
}
