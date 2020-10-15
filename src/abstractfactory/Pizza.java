package abstractfactory;

import java.util.ArrayList;

public abstract class Pizza {
	
	String name;
	Sauce sauce;
	Cheese cheese;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("放入烤箱烘烤");
	}
	
	public void cut() {
		System.out.println("切成小块");
	}
	
	public void box() {
		System.out.println("放入披萨盒中");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

