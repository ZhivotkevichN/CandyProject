package by.candy.product.builders;

import by.candy.product.entity.ChocolateCandy;
import by.candy.product.entity.ChocolateCandyFiller;
import by.candy.product.entity.Sweet;

public class ChocolateCandyKryzhachekBuilder implements SweetsBuilder {

	@Override
	public Sweet createSweet() {

		return new ChocolateCandy("Kryzhachek", "Kommunarka", "4570-93", 30, 100, 30, false,
				ChocolateCandyFiller.COCOA_CRUMB);
	}

}
