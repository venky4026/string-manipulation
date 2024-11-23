package com.string.app.designpattern;

public class BuilderTest {
	
	public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .Crust("Thick")
                .build();

        System.out.println("Crust: " + pizza.getCrust());
    }


}
