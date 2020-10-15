package abstractfactory;

public class BPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new BSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new BCheese();
	}

}
