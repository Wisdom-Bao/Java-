package abstractfactory;

public class APizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new APizzaIngredientFactory();
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("ÄÌÀÒÅûÈø");
		}else if(type.equals("sauce")) {
			pizza = new SaucePizza(ingredientFactory);
			pizza.setName("Ìğ½´ÅûÈø");
		}
		return pizza;
	}

}
