package Test;

import java.util.*;

public class Exercise66test {
	public static int greatest(ArrayList<Integer> list) {
	   int greatest = list.get(0);
	   for (int num : list) {
		   if (num > greatest) {
			   greatest = num;
		   }
	   }
	   return greatest;
	}

	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);

	    System.out.println("The greatest number is: " + greatest(list));
	}
}
