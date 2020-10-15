package abstractfactory;

public class CheesePizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("׼����ʼ�� " + name);
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
