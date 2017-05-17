package com.dp.iterator.hotel.flavor2;

import java.util.Iterator;

/**
 * Created by sandeep on 22/8/15.
 */
public class DinnerHouseMenuIterator implements Iterator<MenuItem> {

    private MenuItem[] menuItems;
    private int position = 0;

    public DinnerHouseMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove the item, until you done" +
                    " with at least one item.");
        }

        if (menuItems[position-1] != null) {
            for (int i = position-1 ; i < (menuItems.length-1) ; i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[menuItems.length-1] = null;
        }
    }
}
