/**
 * 
 */
package starbuzz.coffeesimulator;

import starbuzz.beverages.Beverage;
import starbuzz.beverages.DarkRoast;
import starbuzz.beverages.Espresso;
import starbuzz.beverages.HouseBlend;
import starbuzz.decorators.Mocha;
import starbuzz.decorators.Soy;
import starbuzz.decorators.Whip;

/**
 * @author santhosh
 *
 */
public class StarBuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.getCost());
		// Make a DarkRoast object
		Beverage beverage2 = new DarkRoast();
		// Wrap it with a Mocha
		beverage2 = new Mocha(beverage2);
		// Wrap it with Mocha
		beverage2 = new Mocha(beverage2);
		// Wrap it in Whip
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.getCost());
	}

}
