package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveSpecailCharacterStringBuilder {

	public static void main(String[] args) {

		StringBuilder input = new StringBuilder("Hello, World!123");

		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetterOrDigit(input.charAt(i))) {
				input.deleteCharAt(i);
				i--;
			}
		}
		log.info(input.toString());
	}

}
