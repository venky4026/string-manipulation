package com.string.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DStringCountForLoop {

	public static void main(String[] args) {
        String input = "aaaazzzzz55";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
            	i++;
                count++;
            }
            sb.append(count).append(input.charAt(i));
        }

        System.out.println(sb.toString()); 
    }
}
