package Sort;

import java.util.*;

public class SortTest2 {
	public static void main(String[] args) {
		Student[] students = {new Student(02, "Anthony"), new Student(03, "Paul"), new Student(01, "James")};
		List<Student> list = Arrays.asList(students);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Student implements Comparable<Student> {
	int num;
	String name;
	
	Student(int num, String name) {
		this.name = name;
		this.num = num;	
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Student s) {
		return num - s.num; // 학번 순으로 정렬 
	}
}
