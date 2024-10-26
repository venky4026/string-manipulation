package com.string.app;

public class StringComparison {

	public static void main(String[] args) {
		String str1 = "hello";

		String str2 = "hello";

		boolean isEqual = str1.equals(str2); // Content comparison

		boolean isSameReference = (str1 == str2); // Reference comparison
		
		System.out.println(isEqual);
		System.out.println(isSameReference);
	}
}
