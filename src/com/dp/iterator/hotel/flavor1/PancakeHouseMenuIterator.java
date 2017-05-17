package com.dp.iterator.hotel.flavor1;

import java.util.ArrayList;

/**
 * Created by sandeep on 22/8/15.
 */
public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
