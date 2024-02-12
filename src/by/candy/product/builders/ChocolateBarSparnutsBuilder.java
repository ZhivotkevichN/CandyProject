package by.candy.product.builders;

import by.candy.product.entity.ChocolateBar;
import by.candy.product.entity.ChocolateBarFiller;
import by.candy.product.entity.Sweet;

public class ChocolateBarSparnutsBuilder implements SweetsBuilder {

	@Override
	public Sweet createSweet() {

		return new ChocolateBar("Sparnuts", "Spartak", "470-97", 100, 250, 80, false, ChocolateBarFiller.NUTS);

	}

}
