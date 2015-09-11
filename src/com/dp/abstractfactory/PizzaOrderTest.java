package com.dp.abstractfactory;

import com.dp.abstractfactory.store.ChicagoPizzaStore;
import com.dp.abstractfactory.store.NYPizzaStore;
import com.dp.abstractfactory.store.PizzaStore;

/**
 * Created by sandeep on 5/9/15.
 */
public class PizzaOrderTest {
    public static void main(String[] args) {
        // PizzaStore pizzaStore = new PizzaStore(new SimplePizzafactory());
        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        pizzaStore1.orderPizza("cheese");

        PizzaStore pizzaStore2 = new NYPizzaStore();
        pizzaStore2.orderPizza("greek");
    }
}
