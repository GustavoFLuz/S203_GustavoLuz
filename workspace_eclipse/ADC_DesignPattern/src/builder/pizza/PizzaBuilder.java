package builder.pizza;

public class PizzaBuilder {
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public Pizza getPizza() {
		if(!(this.pizza.getFlagCheese() || this.pizza.getFlagPepperoni()))
			throw new IllegalStateException("Ingredientes insuficientes");
		if(this.pizza.getSize()<=0 || this.pizza.getSize()>=4)
			throw new IllegalStateException("Tamanho inválido");
		return this.pizza;
	}
}
