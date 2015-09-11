package com.dp.abstractfactory.pizza.chicago;

import com.dp.abstractfactory.pizza.Pizza;

/**
 * Created by sandeep on 5/9/15.
 */
public class ChicagoGreekPizza extends Pizza {

    public ChicagoGreekPizza() {
        name = "Chicago Style Deep Dish Greek Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
