package by.candy.product.builders;

import by.candy.product.entity.Lollipop;
import by.candy.product.entity.LollipopFiller;
import by.candy.product.entity.LollipopTastes;
import by.candy.product.entity.Sweet;

public class LollipopBuratinoBuilder implements SweetsBuilder{

	@Override
	public Sweet createSweet() {
	
		return new Lollipop("Buratino", "Kommunarka", "470-97", 10, 100, LollipopTastes.BURATINO, LollipopFiller.NONE);

	}

}
