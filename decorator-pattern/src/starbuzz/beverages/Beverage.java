package starbuzz.beverages;

/**
 * Beverage is an abstract class with the two methods getDescription() and
 * cost().
 * 
 * getDescription is already implemented for us, but we need to implement cost()
 * in the subclasses.
 * 
 * @author santhosh
 *
 */
public abstract class Beverage {
	String description;

	public String getDescription() {
		return description;
	}

	public abstract double getCost();
}
