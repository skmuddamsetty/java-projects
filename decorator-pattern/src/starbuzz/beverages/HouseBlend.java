package starbuzz.beverages;

/**
 * Okay, here’s another Beverage. All we do is set the appropriate description,
 * “House Blend Coffee,” and then return the correct cost: 89¢.
 * 
 * @author santhosh
 *
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double getCost() {
		return .89;
	}
}