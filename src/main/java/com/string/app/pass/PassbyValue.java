package com.string.app.pass;

public class PassbyValue {
	public static void main(String[] args) {
		int x = 5;
		changeValue(x);
		System.out.println(x); // prints 5
	}

	public static void changeValue(int x) {
		x = 10;
	}
}
