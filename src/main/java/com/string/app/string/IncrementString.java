package com.string.app.string;

public class IncrementString {
	public static void main(String[] args) {
		String input = "002";
		Integer number = Integer.parseInt(input);
		number++;
		String nextValue = String.format("%03d", number);
		System.out.println(nextValue);
	}

}
