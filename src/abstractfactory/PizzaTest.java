package abstractfactory;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore aPizzaStore = new APizzaStore();
		Pizza pizza = aPizzaStore.orderPizza("cheese");
	}

}
