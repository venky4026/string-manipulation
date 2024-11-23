package com.string.app.pass;

public class PassbyReference {

	public static void main(String[] args) {
		Person person = new Person("John");
		changeName(person);
		System.out.println(person.getName()); // prints "Jane"
	}

	public static void changeName(Person person) {
		person.setName("Jane");
	}

}
