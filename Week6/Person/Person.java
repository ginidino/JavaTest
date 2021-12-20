package test6;

public class Person {
	private String name;
	private int age;

	public Person(String name) {
		this.name = name;
		this.age = 0;
	}

	public String getName() {
		return this.name;
	}

	public void becomeOlder() {
		this.age++;
		
	}

	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		} 
		return false;
	}
}
