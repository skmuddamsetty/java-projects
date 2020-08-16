/**
 * 
 */
package pizzastore.simulators;

import pizzastore.stores.NYPizzaStore;
import pizzastore.stores.PizzaStore;

/**
 * @author santhosh
 *
 */
public class PizzaOrderSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("cheese");
		pizzaStore.orderPizza("clam");
	}

}
