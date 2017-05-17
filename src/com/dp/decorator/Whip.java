package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return 0.15 + beverage.getCost();
    }
}
