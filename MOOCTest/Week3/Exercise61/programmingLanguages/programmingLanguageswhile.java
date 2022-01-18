package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class programmingLanguageswhile {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> programmingLanguages = new ArrayList<String>();
		System.out.println("Type programmingLanguages");
		while(true) {
			String word = reader.nextLine();
			if (word.isEmpty()) {
				break;
			}
			programmingLanguages.add(word);
		}
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

	public static void removeFirst(ArrayList<String> list) {
		list.remove(0);
	}
}
