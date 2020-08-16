package starbuzz.beverages;

/**
 * Okay, here’s another Beverage. All we do is set the appropriate description,
 * “House Blend Coffee,” and then return the correct cost: 89¢.
 * 
 * @author santhosh
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double getCost() {
		return .99;
	}
}