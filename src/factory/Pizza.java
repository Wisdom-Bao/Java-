package factory;

import java.util.ArrayList;

public class Pizza {
	
	String name;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public void prepare() {
		System.out.println("准备开始做 " + name);
		System.out.println("添加调料...");
		System.out.print("添加配料:");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}
	
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
}
