package com.string.app.innerclass;

import java.io.Serializable;

public class OuterClass1 implements Serializable{
	private static int x = 10;

	public static class InnerClass {
		public void printX() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		OuterClass1.InnerClass inner = new OuterClass1.InnerClass();
		inner.printX(); // prints 10
	}
}
