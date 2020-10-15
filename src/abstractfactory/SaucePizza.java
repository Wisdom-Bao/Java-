package abstractfactory;

public class SaucePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public SaucePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备开始做 " + name);
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
