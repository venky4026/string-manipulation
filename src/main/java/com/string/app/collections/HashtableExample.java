package com.string.app.collections;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs
        hashtable.put("John", 25);
        hashtable.put("Jane", 30);
        hashtable.put("Bob", 35);

        // Retrieve values
        System.out.println(hashtable.get("John")); // Output: 25
        System.out.println(hashtable.get("Jane")); // Output: 30
    }
}
