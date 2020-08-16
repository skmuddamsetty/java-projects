/**
 * 
 */
package starbuzz.decorators;

import starbuzz.beverages.Beverage;

/**
 * @author santhosh
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	/**
	 * We’re going to instantiate Mocha with a reference to a Beverage using: An
	 * instance variable to hold the beverage we are wrapping. A way to set this
	 * instance variable to the object we are wrapping. Here, we’re going to to pass
	 * the beverage we’re wrapping to the decorator’s constructor.
	 * 
	 * @param beverage
	 */
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	/**
	 * We want our description to not only include the beverage - say “Dark Roast” -
	 * but also to include each item decorating the beverage, for instance, “Dark
	 * Roast, Mocha”. So we first delegate to the object we are decorating to get
	 * its description, then append “, Mocha” to that description.
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	/**
	 * Now we need to compute the cost of our beverage with Mocha. First, we
	 * delegate the call to the object we’re decorating, so that it can compute the
	 * cost; then, we add the cost of Mocha to the result.
	 */
	@Override
	public double getCost() {
		return .20 + beverage.getCost();
	}

}
