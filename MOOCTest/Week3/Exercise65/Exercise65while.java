package Test;

import java.util.*;

public class Exercise65while {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Type words");
		while(true) {
			String word = reader.nextLine();
			
			if (word.isEmpty()) {
				break;
			}
			list.add(word);
		}
		ArrayList<Integer> lengths = lengths(list);

	    System.out.println("The lengths of the Strings: " + lengths);
	}
	public static ArrayList<Integer> lengths(ArrayList<String> list) {
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		for (String length : list) {
			lengths.add(length.length());
		}
		return lengths;
	}
}
