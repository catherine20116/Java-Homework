package classes;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
	String name;
	String surname;
	LocalDate bday;

	public Person(String name, String surname, String bday) {
		this.name = name;
		this.surname = surname;
		this.bday = LocalDate.parse(bday);
	}
	
	public String toString() {
		return String.format("Name: %s, Surname: %s", this.name, this.surname) + ", Bday: " + this.bday;
	}

	@Override
	public int compareTo(Person anotherPerson) {
	    return this.bday.compareTo(anotherPerson.bday);
	}
	
	
	
}
