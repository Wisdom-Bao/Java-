package strategy;

public class NormalDuck extends Duck{
	
	public NormalDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWay();
	}

	@Override
	public void display() {
		System.out.println("这是一只正常的鸭子");
	}

}
