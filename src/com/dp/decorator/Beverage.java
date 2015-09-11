package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public abstract class Beverage {
    public String getDescription() {
        return "Unknown Beverage";
    }

    public abstract double getCost();
}
