package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringHorizontalToVertical {
	
	public static void main(String[] args) {
		
		String sentence = "I love Java programming";
		String[] words = sentence.split(" ");
		
		for (String word : words) {
			log.info("StringHorizontalToVertical : {}", word);
		}
	}
}
