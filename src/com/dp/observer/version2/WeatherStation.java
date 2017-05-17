package com.dp.observer.version2;

/**
 * Created by sandeep on 28/8/15.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currCondDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 32.4F);
        weatherData.setMeasurements(30, 25, 22.4F);
        weatherData.setMeasurements(99, 75, 52.4F);
    }
}
