package strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("这是一只玩具鸭");
	}

}
