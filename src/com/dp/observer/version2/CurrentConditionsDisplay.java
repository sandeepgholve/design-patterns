package com.dp.observer.version2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sandeep on 28/8/15.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temprature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temprature = weatherData.getTemprature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: Temp = " + this.temprature
            + " F degrees and " + this.humidity + "% Humidity");
    }
}
