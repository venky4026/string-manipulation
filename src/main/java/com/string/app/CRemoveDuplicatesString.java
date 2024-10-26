package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CRemoveDuplicatesString {

	public static void main(String[] args) {
		String input = "Hello";
		String output = "";

		for (int i = 0; i < input.length(); i++) {

			boolean isDuplicated = false;

			for (int j = 0; j < output.length(); j++) {

				if (input.charAt(i) == output.charAt(j)) {
					isDuplicated = true;
					break;
				}
			}
			if (!isDuplicated) {
				output = output + input.charAt(i);
			}
		}
		log.info("RemoveDuplicatesString : {}", output);
	}

}
