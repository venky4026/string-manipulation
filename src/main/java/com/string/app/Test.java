package com.string.app;

public class Test {
	public static void main(String[] args) {
		String sentenec = "Hello Man How are You";

		String[] word=sentenec.trim().split("\\s+");
		int wordCount = word.length;

		System.out.println(wordCount);

	}
}
