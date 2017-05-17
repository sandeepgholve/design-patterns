package com.dp.iterator.hotel.flavor1;

/**
 * Created by sandeep on 22/8/15.
 */
public class DinnerHouseMenuIterator implements Iterator {

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
}
