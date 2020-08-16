package starbuzz.beverages;

/**
 * First we extend the Beverage class, since this is a beverage.
 * 
 * @author santhosh
 *
 */
public class Espresso extends Beverage {

	/**
	 * To take care of the description, we set this in the constructor for the
	 * class. Remember the description instance variable is inherited from Beverage.
	 */
	public Espresso() {
		description = "Espresso";
	}

	/**
	 * Finally, we need to compute the cost of an Espresso. We don’t need to worry
	 * about adding in condiments in this class, we just need to return the price of
	 * an Espresso: $1.99.
	 */
	@Override
	public double getCost() {
		return 1.99;
	}
}