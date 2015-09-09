package com.dp.factory.pizza.ny;

import com.dp.factory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class NYPepperoniPizza extends Pizza {

    public NYPepperoniPizza() {
        name = "NY Style Sauce and Pepperoni Pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano");
    }
}
