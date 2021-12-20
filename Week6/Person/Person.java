package test6;

public class Person {
	private String name;
	private String number;
	private int age;

	public Person(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public Person(String name) {
		this.name = name;
		this.age = 0;
	}

	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}

	public void changeNumber(String newNumber) {
		number = newNumber;
	}
	
	public String toString() {
        return name + " number: " + number;
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
