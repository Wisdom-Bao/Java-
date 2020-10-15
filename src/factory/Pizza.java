package factory;

import java.util.ArrayList;

public class Pizza {
	
	String name;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public void prepare() {
		System.out.println("׼����ʼ�� " + name);
		System.out.println("��ӵ���...");
		System.out.print("�������:");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}
	
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
}
