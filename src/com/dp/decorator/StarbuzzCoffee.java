package com.dp.decorator;

/**
 * Created by sandeep on 29/8/15.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.getCost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Moch(beverage1);
        beverage1 = new Moch(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + ", $" + beverage1.getCost());
    }
}
