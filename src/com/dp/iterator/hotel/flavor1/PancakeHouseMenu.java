package com.dp.iterator.hotel.flavor1;

import java.util.ArrayList;

/**
 * Created by sandeep on 22/8/15.
 */
public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addMenu("Chocolate Cake", "Yummy dark chocalte cake", true, 50.0);
        addMenu("Pan Cake", "Normal cake", true, 30.0);
        addMenu("Brownie", "superb hot brownie", true, 80.0);
        addMenu("Egg Cake", "Egg healthy cake", false, 60.0);
    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}
