package com.string.app.java8;

public interface Vehicle {
    default void honk() {
        System.out.println("Honk!");
    }
}
