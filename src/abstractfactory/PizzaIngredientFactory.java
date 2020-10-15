package abstractfactory;

import java.util.zip.CheckedInputStream;

public interface PizzaIngredientFactory {
	
	public Sauce createSauce();
	public Cheese createCheese();
	
}
