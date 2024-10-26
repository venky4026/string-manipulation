package com.string.app;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Venkat
 */
@Slf4j
public class ReverseStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		usingStringBulider();
	}

	/**
	 * @return
	 */
	public static String usingStringBulider() {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.reverse();
		log.info("String Bulider : {}", stringBuilder);
		return stringBuilder.toString();
	}

}
