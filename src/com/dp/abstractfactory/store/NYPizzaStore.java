package com.dp.abstractfactory.store;

import com.dp.abstractfactory.pizza.Pizza;
import com.dp.abstractfactory.pizza.ny.NYCheesePizza;
import com.dp.abstractfactory.pizza.ny.NYGreekPizza;
import com.dp.abstractfactory.pizza.ny.NYPepperoniPizza;

/**
 * Created by sandeep on 6/9/15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "greek":
                pizza = new NYGreekPizza();
                break;
            case "pepperoni":
                pizza = new NYPepperoniPizza();
                break;
        }
        return pizza;
    }
}
