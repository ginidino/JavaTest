package test;

import java.util.Arrays;

public class CopyAndReverse {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
		// copy
		int[] copy = original.clone();
		int[] a = Arrays.copyOf(original, original.length);
		
		copy[0] = 99;
		a[1] = 33;
		
		//reverse -> without using library
		int[] rev = {1, 2, 3, 4};
		for (int i = 0; i < rev.length/2; i++) {
			int temp = rev[i];
			rev[i] = rev[rev.length - i -1];
			rev[rev.length - i -1] = temp;
			
		}
		// another way
		int[] reve = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			int temp = original[i];
			reve[i] = original[original.length - i - 1];
			original[i] = temp;
		}
		
		
		System.out.println("original: " + Arrays.toString(original));
	    System.out.println("copied: " + Arrays.toString(copy));
	    System.out.println("copied: " + Arrays.toString(a));
	    System.out.println("reverse: " + Arrays.toString(rev));
	    System.out.println("reverse: " + Arrays.toString(reve));
	}
}
