package com.string.app.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> nameAges = new TreeMap<>();
		nameAges.put("John", 25);
		nameAges.put("Alice", 30);
		nameAges.put("Bob", 20);

		for (String name : nameAges.keySet()) {
			System.out.println(name + ": " + nameAges.get(name));
		}
	}
}
