package com.string.app;

public class RemoveLastCharacter {

	public static void main(String[] args) {
		String str = "Hello World!";

		String newStr = str.substring(0, str.length() - 1);

		System.out.println(newStr); // Output: Hello World
	}
}
