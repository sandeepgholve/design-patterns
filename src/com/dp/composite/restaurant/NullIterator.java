package com.dp.composite.restaurant;

import java.util.Iterator;

/**
 * Created by sandeep on 22/8/15.
 */
public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
