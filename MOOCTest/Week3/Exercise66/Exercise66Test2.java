package Test;

import java.util.*;

//Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter 
//and then returns the greatest number and minimum number in the list as a return value.
public class Exercise66Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);
	    
	    int max = list.get(0);
	    int min = list.get(0);
	    
	    for (int i = 1; i < list.size(); i++) {
	    	if (list.get(i) > max) {
	    		max = list.get(i);
	    	} else if (list.get(i) < min) {
	    		min = list.get(i);
	    	}
	    }
	    System.out.println("The greatest number is: " + max);
	    System.out.println("The minimum number is: " + min);
	}
}
