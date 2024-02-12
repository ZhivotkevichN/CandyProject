package by.candy.product.builders;

import by.candy.product.entity.Lollipop;
import by.candy.product.entity.LollipopFiller;
import by.candy.product.entity.LollipopTastes;
import by.candy.product.entity.Sweet;

public class LollipopBarbarisBuilder implements SweetsBuilder{

	@Override
	public Sweet createSweet() {
		return new Lollipop("Barbaris", "Spartak", "470-97", 10, 110, LollipopTastes.STARWBERRY, LollipopFiller.STRAWBERRY_JAM);
	}
	
	

}
