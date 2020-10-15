package strategy;

public class ModelDuckTest {

	public static void main(String[] args) {
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		System.out.println("玩具鸭摔了一下");
		modelDuck.setQuackBehavior(new MuteQuack());
		modelDuck.performQuack();
	}

}
