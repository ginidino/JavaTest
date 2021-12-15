package test;

import java.util.*;

public class Variance {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
	    list.add(2);
	    list.add(7);
	    list.add(2);
	    
	    double sum = 0;
	    double average = 0;
	    double difference = 0;
	    double squareOfDifference = 0;
	    double var = 0;
	    
	    for (double num : list) {
	    	sum += num;
	    }
	    average =  sum / list.size();
	    for (int i : list) {
	    	difference = i - average;
	    	squareOfDifference += Math.pow(difference, 2);
	    }
	    var = squareOfDifference / (list.size() - 1);
	    System.out.println(var);
	}
}
