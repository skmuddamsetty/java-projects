/**
 * 
 */
package starbuzz.decorators;

import starbuzz.beverages.Beverage;

/**
 * @author santhosh
 *
 *         First, we need to be interchangeable with a Beverage, so we extend
 *         the Beverage class. We’re also going to require that the condiment
 *         decorators all reimplement the getDescription() method. Again, we’ll
 *         see why in a sec...
 */
public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();

}
