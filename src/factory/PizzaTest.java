package factory;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore pizzaStore = new APizzaStore();
		Pizza cheesePizza = pizzaStore.createPizza("cheese");
		cheesePizza.prepare();
		System.out.println("����һ��" + cheesePizza.getName());
		Pizza hamPizza = pizzaStore.createPizza("ham");
		hamPizza.prepare();
		System.out.println("����һ��" + hamPizza.getName());
	}

}
