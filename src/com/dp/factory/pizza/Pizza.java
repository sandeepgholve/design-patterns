package com.dp.factory.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandeep on 30/8/15.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println(getName() + ": -- Preparing.....");
        System.out.println("-- Tossing dough.....");
        System.out.println("-- Adding sauce.....");
        System.out.println("-- Adding toppings.....");
        for (String topping : toppings) {
            System.out.println("---- " + topping);
        }
    }

    public void bake() {
        System.out.println(getName() + ": -- Baking.....");
    }

    public void cut() {
        System.out.println(getName() + ": -- Cutting it into pieces.....");
    }

    public void box() {
        System.out.println(getName() + ": -- Packing it into the box.....");
    }

    public String getName() {
        return name;
    }
}
