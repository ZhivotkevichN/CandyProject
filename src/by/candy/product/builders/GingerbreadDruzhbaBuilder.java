package by.candy.product.builders;

import by.candy.product.entity.Gingerbread;
import by.candy.product.entity.GingerbreadFiller;
import by.candy.product.entity.Sweet;

public class GingerbreadDruzhbaBuilder implements SweetsBuilder {

	@Override
	public Sweet createSweet() {
		return new Gingerbread("Druzhba", "Bread Factory No1", "450-40", 60, 20, 200, 5, GingerbreadFiller.RAISINS);
	}

}
