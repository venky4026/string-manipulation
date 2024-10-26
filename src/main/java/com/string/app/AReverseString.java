package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AReverseString {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Hello";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output = input.charAt(i) + output;
		}
		log.info("Reverser String : {}", output);

	}

}
