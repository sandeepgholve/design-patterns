package com.dp.abstractfactory.pizza.chicago;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class ChicagoPepperoniPizza extends Pizza {

    public ChicagoPepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
