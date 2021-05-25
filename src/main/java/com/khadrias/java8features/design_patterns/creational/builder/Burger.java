package com.khadrias.java8features.design_patterns.creational.builder;

// 
public class Burger {
	private String bread;
	private String patty;
	private String veggies;
	private String sauces;
	private Boolean withExtraCheese = Boolean.FALSE;

	public Burger(BurgerBuilder burgerBuilder) {
		this.bread = burgerBuilder.bread;
		this.patty = burgerBuilder.patty;
		this.veggies = burgerBuilder.veggies;
		this.sauces = burgerBuilder.sauces;
		this.withExtraCheese = burgerBuilder.withExtraCheese;
	}

	public String getBread() {
		return bread;
	}

	public String getPatty() {
		return patty;
	}

	public String getVeggies() {
		return veggies;
	}

	public String getSauces() {
		return sauces;
	}

	public Boolean getWithExtraCheese() {
		return withExtraCheese;
	}

	public static class BurgerBuilder {
		private String bread;
		private String patty;
		private String veggies;
		private String sauces;
		private Boolean withExtraCheese = Boolean.FALSE;

		public BurgerBuilder() {
		}

		public BurgerBuilder addBread(String bread) {
			this.bread = bread;
			return this; // fluent interface
		}

		public BurgerBuilder addPatty(String patty) {
			this.patty = patty;
			return this; // fluent interface
		}

		public BurgerBuilder addVeggies(String veggies) {
			this.veggies = veggies;
			return this; // fluent interface
		}

		public BurgerBuilder addSauce(String sauce) {
			this.sauces = sauce;
			return this; // fluent interface
		}

		public BurgerBuilder addCheeze() {
			this.withExtraCheese = Boolean.TRUE;
			return this; // fluent interface
		}

		public Burger build() {
			return new Burger(this);
		}
	}

	@Override
	public String toString() {
		return "Burger [bread=" + bread + ", patty=" + patty + ", veggies=" + veggies + ", sauces=" + sauces
				+ ", withExtraCheese=" + withExtraCheese + "]";
	}

	public static void main(String[] args) {

		Burger vegBurger = new BurgerBuilder().addBread("Brown Bread").addPatty("Veggie").addVeggies("Pickles")
				.addSauce("All").addCheeze().build();
		System.out.println(vegBurger);
	}
}