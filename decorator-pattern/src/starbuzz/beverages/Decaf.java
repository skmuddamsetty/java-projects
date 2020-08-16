package starbuzz.beverages;

/**
 * Okay, here’s another Beverage. All we do is set the appropriate description,
 * “House Blend Coffee,” and then return the correct cost: 89¢.
 * 
 * @author santhosh
 *
 */
public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double getCost() {
		return 1.05;
	}
}