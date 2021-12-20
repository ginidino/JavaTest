package test;

import java.util.Scanner;

public class creatingNewArray {
	public static void main(String[] args) {
		int cells = 99;
		int[] array = new int[cells];
		
		if (array.length == cells) {
			System.out.println("The length of the array is " + cells);
		} else {
			System.out.println("Something unreal happened. The length of the array is something else than " + cells);
		}
	}
}
