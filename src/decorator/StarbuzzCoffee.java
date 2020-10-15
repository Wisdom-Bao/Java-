package decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		beverage.setSize("big");
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + "$" + beverage.cost());
		Beverage beverage2 = new HouseBlend();
		beverage2.setSize("big");
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		
		System.out.println(beverage2.getDescription() + "$" + beverage2.cost());
	}

}
