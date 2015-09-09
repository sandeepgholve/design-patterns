package com.dp.abstractfactory.store;

import com.dp.abstractfactory.pizza.Pizza;
import com.dp.abstractfactory.pizza.chicago.ChicagoCheesePizza;
import com.dp.abstractfactory.pizza.chicago.ChicagoGreekPizza;
import com.dp.abstractfactory.pizza.chicago.ChicagoPepperoniPizza;

/**
 * Created by sandeep on 6/9/15.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
        }
        return pizza;    }
}
