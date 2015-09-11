package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        return 0.30 + beverage.getCost();
    }
}
