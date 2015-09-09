package com.dp.iterator.hotel.flavor1;

/**
 * Created by sandeep on 22/8/15.
 */
public class DinnerHouseMenu {
    private static final int MAX_ITEMS = 5;
    private int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerHouseMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addMenu("Shahi Paneer", "Indian special shahi panner", true, 120.0);
        addMenu("Chiken Masala", "Indian special Chiken dish", false, 180.0);
        addMenu("Mutton Masala", "Indian special Mutton dish", true, 230.0);
        addMenu("Aloo Palak", "Normal veg dish", true, 100.0);
        addMenu("Mashroom Masala", "Indian Mashroon special recipe", true, 150.0);
    }

    public void addMenu(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, Menu is full. Can't add any more items.");
        } else {
            MenuItem item = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }

    }

    public Iterator createIterator() {
        return new DinnerHouseMenuIterator(menuItems);
    }
}
