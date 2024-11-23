package com.string.app.java8;

public class MethodRefernce {

	public static void main(String[] args) {

		Calculator calculator = MathUtils::add;
		int result = calculator.calculate(2, 3);

		System.out.println(result); // Output: 5
	}

}
