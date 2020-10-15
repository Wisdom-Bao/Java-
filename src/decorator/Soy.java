package decorator;

public class Soy extends CondimentDecorator{
	
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "," + "soy," + beverage.getSize();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost();
		if(getSize().equals("small")) {
			cost += 3;
		}else if(getSize().equals("middle")) {
			cost += 5;
		}else if(getSize().equals("big")){
			cost += 6;
		}
		return cost;
	}

}
