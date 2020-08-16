/**
 * 
 */
package pizzastore.factories;

import pizzastore.cheeses.ReggianoCheese;
import pizzastore.clams.FreshClams;
import pizzastore.doughs.ThinCrustDough;
import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.Veggies;
import pizzastore.pepperonis.SlicedPepperoni;
import pizzastore.sauces.MarinaraSauce;
import pizzastore.veggies.Garlic;
import pizzastore.veggies.Mushroom;
import pizzastore.veggies.Onion;
import pizzastore.veggies.RedPepper;

/**
 * @author santhosh
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
