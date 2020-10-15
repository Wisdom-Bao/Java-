package strategy;

public class NormalDuck extends Duck{
	
	public NormalDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithNoWay();
	}

	@Override
	public void display() {
		System.out.println("����һֻ������Ѽ��");
	}

}
