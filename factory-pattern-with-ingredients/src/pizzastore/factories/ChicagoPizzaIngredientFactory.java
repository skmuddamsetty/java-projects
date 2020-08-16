package pizzastore.factories;

import pizzastore.cheeses.MozzarellaCheese;
import pizzastore.clams.FrozenClams;
import pizzastore.doughs.ThickCrustDough;
import pizzastore.ingredients.Cheese;
import pizzastore.ingredients.Clams;
import pizzastore.ingredients.Dough;
import pizzastore.ingredients.Pepperoni;
import pizzastore.ingredients.Sauce;
import pizzastore.ingredients.Veggies;
import pizzastore.pepperonis.SlicedPepperoni;
import pizzastore.sauces.PlumTomatoSauce;
import pizzastore.veggies.BlackOlives;
import pizzastore.veggies.EggPlant;
import pizzastore.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}