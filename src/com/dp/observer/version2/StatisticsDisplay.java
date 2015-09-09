package com.dp.observer.version2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sandeep on 28/8/15.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float min = 0;
    private float max = 0;
    private float avg = 0;
    private int count = 0;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            float temp = weatherData.getTemprature();
            if (count == 0) {
                min = max = avg = temp;
            } else {
                min = min < temp ? min : temp;
                max = max > temp ? max : temp;
                avg = (float)((avg + temp) / 2.0);
            }
            count++;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Statistics: Min / Max / Avg = " + min
                + " / " + max + " / " + avg);
    }
}
