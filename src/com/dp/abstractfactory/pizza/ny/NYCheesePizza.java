package com.dp.abstractfactory.pizza.ny;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano");
    }
}
