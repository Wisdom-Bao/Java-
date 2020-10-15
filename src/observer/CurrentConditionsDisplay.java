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
		System.out.println("这是 weather station");
		System.out.println("现在的温度是：" + temperature);
		System.out.println("现在的湿度是：" + humidity);
		System.out.println("现在的大气压是：" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
