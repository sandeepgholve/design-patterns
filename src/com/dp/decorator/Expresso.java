package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class Expresso extends Beverage {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
