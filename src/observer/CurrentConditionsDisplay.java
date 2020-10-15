package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject subject) {
		this.weatherData = subject;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("���� weather station");
		System.out.println("���ڵ��¶��ǣ�" + temperature);
		System.out.println("���ڵ�ʪ���ǣ�" + humidity);
		System.out.println("���ڵĴ���ѹ�ǣ�" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
