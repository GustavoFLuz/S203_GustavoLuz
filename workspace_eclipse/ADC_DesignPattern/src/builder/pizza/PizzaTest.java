package builder.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void DeveConstruirPizzaValida() {
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();

		assertNotNull(pizza);
		assertNotNull(pizza.getSize());
		assertTrue(pizza.getFlagCheese());
		assertTrue(pizza.getFlagPepperoni());
	}

}
