package com.string.app;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Venkat
 */
@Slf4j
public class BRemoveSpecailCharacterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Hello";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				output += ch;
			}
		}
		log.info("Remove Specail Character : {}", output);

	}

}
