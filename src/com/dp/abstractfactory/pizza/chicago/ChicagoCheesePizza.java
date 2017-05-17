package com.dp.abstractfactory.pizza.chicago;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
