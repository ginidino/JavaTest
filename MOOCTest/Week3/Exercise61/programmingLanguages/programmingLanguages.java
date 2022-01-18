package Test;

import java.util.*;

//Inside the method, it is possible to influence the items in the parameter list.
// the method removeFirst --as the name suggests-- removes the first string from the list
public class programmingLanguages {
	public static void main(String[] args) {
		ArrayList<String> programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("Pascal");
	    programmingLanguages.add("Java");
	    programmingLanguages.add("Python");
	    programmingLanguages.add("Ruby");
	    programmingLanguages.add("C++");
	    
	    print(programmingLanguages);
	    
	    removeFirst(programmingLanguages);
	    System.out.println();
	    print(programmingLanguages);
	}

	public static void print(ArrayList<String> printed) {
		for (String word : printed) {
			System.out.println(word);
		}
	}
	
	private static void removeFirst(ArrayList<String> list) {
		list.remove(0);
	}
}
