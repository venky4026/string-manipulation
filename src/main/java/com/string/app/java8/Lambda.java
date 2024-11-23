package com.string.app.java8;

public class Lambda {

	public static void main(String[] args) {
		Printer printer = (message) -> System.out.println(message);
		printer.print("Hello Lamda ");
	}

}
