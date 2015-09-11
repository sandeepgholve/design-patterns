package com.dp.factory.store;

import com.dp.factory.pizza.Pizza;
import com.dp.factory.pizza.ny.NYCheesePizza;
import com.dp.factory.pizza.ny.NYGreekPizza;
import com.dp.factory.pizza.ny.NYPepperoniPizza;

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
