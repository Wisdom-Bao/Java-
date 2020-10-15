package abstractfactory;

public class SaucePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public SaucePizza(PizzaIngredientFactory ingredientFactory) {
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
