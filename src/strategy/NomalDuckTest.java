package strategy;

public class NomalDuckTest {

	public static void main(String[] args) {
		Duck normalDuck = new NormalDuck();
		normalDuck.display();
		normalDuck.performFly();
		normalDuck.performQuack();
	}

}
