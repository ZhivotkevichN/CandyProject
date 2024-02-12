package by.candy.product.builders;

import by.candy.product.entity.ChocolateCandy;
import by.candy.product.entity.ChocolateCandyFiller;
import by.candy.product.entity.Sweet;

public class ChocolateCandyAlenkaBuilder implements SweetsBuilder {

	@Override
	public Sweet createSweet() {

		return new ChocolateCandy("Alenka", "Spartak", "4570-93", 27, 130, 40, true,
				ChocolateCandyFiller.NONE);
	}
	
}
