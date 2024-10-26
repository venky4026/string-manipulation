package com.string.app;

import java.util.HashMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EWordFrequency {
	public static void main(String[] args) {
		String sentence = "I love Java programming love Java Java";

		// Split the sentence into words
		String[] words = sentence.split("\\s+");

		// Create a HashMap to store word counts
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Count occurrences of each word
		for (String word : words) {
			// Normalize to lower case for case-insensitive counting
			word = word.toLowerCase();
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		// Print the word counts
		for (String word : wordCountMap.keySet()) {
			log.info("The word " + word + " appears " + wordCountMap.get(word) + " times.");
		}
	}
}
