package com.dp.iterator.hotel.flavor2;

import java.util.Iterator;

/**
 * Created by sandeep on 22/8/15.
 */
public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerHouseMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerHouseMenu = dinnerHouseMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> iterator1 = pancakeHouseMenu.createIterator();
        System.out.println(" ---- BREAK FAST MENU ---- \n");
        printMenu(iterator1);
        Iterator<MenuItem> iterator2 = dinnerHouseMenu.createIterator();

        System.out.println(" ---- LUNCH MENU ---- \n");
        printMenu(iterator2);
    }

    private void printMenu(Iterator<MenuItem> menIterator) {
        while (menIterator.hasNext()) {
            MenuItem menuItem = menIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
