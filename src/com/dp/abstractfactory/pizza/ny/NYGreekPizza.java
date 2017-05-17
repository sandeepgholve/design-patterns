package com.dp.abstractfactory.pizza.ny;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class NYGreekPizza extends Pizza {

    public NYGreekPizza() {
        name = "NY Style Sauce and Greek Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano");
    }
}
