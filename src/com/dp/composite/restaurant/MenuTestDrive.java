package com.dp.composite.restaurant;

/**
 * Created by sandeep on 22/8/15.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHoueMenu = new Menu("PAN CAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("LUNCH MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("DINNER MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All Mennu Combined");
        allMenus.add(pancakeHoueMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Italian Pasta", true, 310.0));
        dinerMenu.add(dessertMenu);
        dinerMenu.add(new MenuItem("Lazania", "Italian Lazania", true, 230.0));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
