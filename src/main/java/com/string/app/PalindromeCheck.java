package com.string.app;

public class PalindromeCheck {
	/**
	 * @param For a string to be considered a Palindrome, it must be identical when
	 *            reversed.
	 */
	public static void main(String[] args) {
		String input = "22";
		boolean isPalindrome = isPalindrome(input);
		System.out.println("Is palindrome: " + isPalindrome); // true
	}

	public static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
}
