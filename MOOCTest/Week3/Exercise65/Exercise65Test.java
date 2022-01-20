package Test;

import java.util.*;

public class Exercise65Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hallo");
	    list.add("Moi");
	    list.add("Benvenuto!");
	    list.add("badger badger badger badger");
	    
	    ArrayList<Integer> lengths = new ArrayList<Integer>();
		for (String length : list) {
			lengths.add(length.length());
		}
		System.out.println("The lengths of the Strings: " + lengths);
	}
}
