package com.string.app.java17;

public class RecordExample {

	public record Person(String name, int age) {
	}

	public static void main(String[] args) {
		Person person = new Person("John", 30);
		//person.name="venk";
		System.out.println(person.name());
		System.out.println(person.age());

	}

}
