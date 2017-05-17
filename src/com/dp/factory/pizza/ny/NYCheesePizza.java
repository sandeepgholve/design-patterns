package com.dp.factory.pizza.ny;

import com.dp.factory.pizza.Pizza;

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
