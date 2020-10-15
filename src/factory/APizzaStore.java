package factory;

public class APizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ACheesePizza();
		}else if(type.equals("ham")) {
			return new AHamPizza();
		}else {
			return null;
		}
	}
	
	

}
