package abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	Sauce sauce;
	Cheese cheese;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("���뿾��濾");
	}
	
	public void cut() {
		System.out.println("�г�С��");
	}
	
	public void box() {
		System.out.println("������������");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

