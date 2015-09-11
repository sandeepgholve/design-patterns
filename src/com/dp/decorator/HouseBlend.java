package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
