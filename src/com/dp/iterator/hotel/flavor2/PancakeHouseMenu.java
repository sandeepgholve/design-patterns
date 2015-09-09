package com.dp.iterator.hotel.flavor2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sandeep on 22/8/15.
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {
        addMenu("Chocolate Cake", "Yummy dark chocalte cake", true, 50.0);
        addMenu("Pan Cake", "Normal cake", true, 30.0);
        addMenu("Brownie", "superb hot brownie", true, 80.0);
        addMenu("Egg Cake", "Egg healthy cake", false, 60.0);
    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

}
