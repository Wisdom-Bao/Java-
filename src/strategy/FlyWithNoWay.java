package strategy;

public class FlyWithNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("当前鸭子不能飞");
	}

}
