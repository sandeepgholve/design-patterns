package com.dp.observer.version2;

import java.util.Observable;

/**
 * Created by sandeep on 28/8/15.
 */
public class WeatherData extends Observable {
    private float temprature;
    private float humidity;
    private float pressure;

    public void measurementChanged() {
        setChanged();

        // Note: We are not sending a data objects with the notify observers
        // i.e. we are using a pull approach.
        notifyObservers();
    }

    public void setMeasurements(float temprature, float humidity, float pressure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemprature() {
        return temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
