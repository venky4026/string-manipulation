package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringCountStringBuilder {
	public static void main(String[] args) {
		String input = "aabbbcdddd";
		StringBuilder sb = new StringBuilder();

		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				sb.append(count).append(input.charAt(i - 1));
				count = 1;
			}
		}
		sb.append(count).append(input.charAt(input.length() - 1));

		log.info("output : {} ", sb.toString()); // Output: 2a3b1c4d

	}

}
