package com.string.app.serach;

public class SearchNumber {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int target = 3;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				System.out.println("Number found at index: " + i);
				break;
			}
		}

	}
}