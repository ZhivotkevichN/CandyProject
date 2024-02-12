package by.candy.product.builders;

import by.candy.product.entity.ChocolateBar;
import by.candy.product.entity.ChocolateBarFiller;
import by.candy.product.entity.Sweet;

public class ChocolateBarAirFunBuilder implements SweetsBuilder {

	
	@Override
	public Sweet createSweet() {

		return new ChocolateBar("Air Fun", "Spartak", "470-97", 85, 190, 20, true, ChocolateBarFiller.NONE);
	}

	
	
}
