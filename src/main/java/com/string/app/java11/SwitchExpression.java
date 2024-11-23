package com.string.app.java11;

public class SwitchExpression {
	public static void main(String[] args) {
		Day day = Day.FRIDAY;
		String result = switch (day) {
		case MONDAY -> "Monday";
		case TUESDAY -> " Hello it's Tuesday";
		default -> "Unknown";
		};
		System.out.println(result);
	}

}
