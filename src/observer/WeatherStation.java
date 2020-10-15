package observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(80.0f, 65.0f, 30.4f);
		weatherData.setMeasurements(70.0f, 55.0f, 20.4f);
		weatherData.removeObserver(conditionsDisplay);
		weatherData.setMeasurements(60.0f, 45.0f, 10.4f);
	}

}
