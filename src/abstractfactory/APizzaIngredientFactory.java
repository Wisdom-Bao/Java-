package abstractfactory;

public class APizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new ASauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ACheese();
	}	
	
}
