package com.string.app.serach;

public class SearchNumber2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Number found at index: " + i);
                found = true;
                break; // Exit the loop once the number is found
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}