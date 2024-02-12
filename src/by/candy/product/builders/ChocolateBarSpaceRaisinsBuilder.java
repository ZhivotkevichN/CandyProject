package by.candy.product.builders;

import by.candy.product.entity.ChocolateBar;
import by.candy.product.entity.ChocolateBarFiller;
import by.candy.product.entity.Sweet;

public class ChocolateBarSpaceRaisinsBuilder implements SweetsBuilder{

	@Override
	public Sweet createSweet() {

		return new ChocolateBar("Space Raisins", "Gomeldrev", "470-97", 85, 270, 70, false, ChocolateBarFiller.RAISINS);

	}
	
}
