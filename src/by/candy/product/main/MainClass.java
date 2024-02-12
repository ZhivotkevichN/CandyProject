package by.candy.product.main;


import by.candy.product.builders.PresentBuilder;
import by.candy.product.entity.Present;
import by.candy.product.entity.Sweet;

public class MainClass {
	
	public static void main(String[] args) {

		Present present = PresentBuilder.createPresent();

		present.sortByWeight();
		
		for (Sweet sweet : present) {
			System.out.println(sweet);
		}

		System.out.println("_______________________________________________");

		for (Sweet sweet : present.getSweetsWithShugarAmountInRange(110, 150)) {
			System.out.println(sweet + " Sugar amount:" + sweet.getSugarAmount());
		}

	}

}
