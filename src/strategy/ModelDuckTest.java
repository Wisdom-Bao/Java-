package strategy;

public class ModelDuckTest {

	public static void main(String[] args) {
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.performQuack();
		System.out.println("���Ѽˤ��һ��");
		modelDuck.setQuackBehavior(new MuteQuack());
		modelDuck.performQuack();
	}

}
