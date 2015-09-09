package com.dp.abstractfactory.store;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 30/8/15.
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
