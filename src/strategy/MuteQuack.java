package strategy;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("当前鸭子不能叫");
	}

}
