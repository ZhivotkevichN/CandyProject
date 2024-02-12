package by.candy.product.builders;

import java.util.List;

import by.candy.product.entity.Present;
import by.candy.product.entity.Sweet;
import by.candy.product.utils.FileUtils;

public class PresentBuilder {

	public static Present createPresent() {

		FileUtils utils = new FileUtils();

		List<Sweet> list = utils.getSweetsListFromFile();

		Present pres = new Present(list);

		return pres;
	}

}
