package pizzastore.factories;

import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.Veggies;

/**
 * For each ingredient we define a create method in our interface. If we’d had
 * some common “machinery” to implement in each instance of factory, we could
 * have made this an abstract class instead...s
 * 
 * @author santhosh
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();
}