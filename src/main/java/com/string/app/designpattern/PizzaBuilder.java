package com.string.app.designpattern;

public class PizzaBuilder {
	String crust;

	public PizzaBuilder Crust(String crust) {
		this.crust = crust;
		return this;
	}

	public Pizza build() {
		return new Pizza(this);
	}

}
