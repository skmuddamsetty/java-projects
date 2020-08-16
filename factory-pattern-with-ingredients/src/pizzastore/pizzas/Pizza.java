/**
 * 
 */
package pizzastore.pizzas;

import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.Veggies;

/**
 * @author santhosh
 *
 *         Each pizza holds a set of ingredients that are used in its
 *         preparation.
 */
public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;

	/**
	 * We’ve now made the prepare method abstract. This is where we are going to
	 * collect the ingredients needed for the pizza, which of course will come from
	 * the ingredient factory.
	 */
	public abstract void prepare();

	public void bake() {
		System.out.println("Baking " + dough + " for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "";
	}
}
