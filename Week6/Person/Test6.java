package test6;

import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Person pekka = new Person("Pekka");
        Person antti = new Person("Antti");
        Person juhana = new Person("Juhana");

        for (int i=0; i < 30; i++) {
            pekka.becomeOlder();
            juhana.becomeOlder();
        }

        antti.becomeOlder();

        reportMaturity(antti);

        reportMaturity(pekka);

        reportMaturity(juhana);
	}

	private static void reportMaturity(Person person) {
		if (person.isAdult()) {
            System.out.println(person.getName() + " is an adult");
        } else {
            System.out.println(person.getName() + " is a minor");
        }
	}
}
