package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class Moch extends CondimentDecorator {
    private Beverage beverage;

    public Moch(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Moch";
    }

    @Override
    public double getCost() {
        return 0.20 + beverage.getCost();
    }
}
