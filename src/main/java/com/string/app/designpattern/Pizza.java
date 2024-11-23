package com.string.app.designpattern;

public class Pizza {

	private String crust;

	// Constructor
	public Pizza(PizzaBuilder builder) {
		this.crust = builder.crust;
	}

	// Getters
	public String getCrust() {
		return crust;
	}

}
