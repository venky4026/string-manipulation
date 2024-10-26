package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringWordCount {
	public static void main(String[] args) {
		String sentence = "I love Java programming love Java Java";

		// Split the sentence by spaces
		String[] words = sentence.trim().split("\\s+");

		// Count the number of words
		int wordCount = words.length;

		// Print the result
		log.info("Number of words: {}", wordCount);
	}

}
