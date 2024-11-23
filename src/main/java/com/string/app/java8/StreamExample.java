package com.string.app.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apricot");

		List<String> result = list.stream()
		        .filter(s -> s.startsWith("a"))
		        .map(String::toUpperCase)
		        .collect(Collectors.toList());

		System.out.println(result); // [APPLE, APRICOT]

	}
}
