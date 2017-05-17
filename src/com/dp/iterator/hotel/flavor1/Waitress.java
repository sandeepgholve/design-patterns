package com.dp.iterator.hotel.flavor1;

/**
 * Created by sandeep on 22/8/15.
 */
public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerHouseMenu dinnerHouseMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerHouseMenu dinnerHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerHouseMenu = dinnerHouseMenu;
    }

    public void printMenu() {
        Iterator iterator1 = pancakeHouseMenu.createIterator();
        System.out.println(" ---- BREAK FAST MENU ---- \n");
        printMenu(iterator1);
        Iterator iterator2 = dinnerHouseMenu.createIterator();
        System.out.println(" ---- LUNCH MENU ---- \n");
        printMenu(iterator2);
    }

    private void printMenu(Iterator menIterator) {
        while (menIterator.hasNext()) {
            MenuItem menuItem = menIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
