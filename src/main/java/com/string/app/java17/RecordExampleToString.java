package com.string.app.java17;

public class RecordExampleToString {

	// Canonical constructor is generated automatically
	public record Person(String name, int age) {
	}

	public static void main(String[] args) {
		Person person = new Person("John", 30);
		System.out.println(person.toString()); // Output: Person[name=John, age=30]
		System.out.println(person.equals(new Person("John", 30))); // Output: true
		System.out.println(person.hashCode()); // Output: a hash code value

	}

}
