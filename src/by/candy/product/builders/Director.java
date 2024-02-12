package by.candy.product.builders;

import by.candy.product.entity.Sweet;

public class Director {

	private SweetsBuilder builder;
	
	public void setBuilder(SweetsBuilder builder){
		this.builder = builder;
	}

	public Sweet createSweet() {
		return builder.createSweet();
	}

}
