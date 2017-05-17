package com.dp.iterator.hotel.flavor2;

/**
 * Created by sandeep on 22/8/15.
 */
public class HotelMenuTestDrive {
    public static void main(String[] args) {
        Menu dinnerHouseMenu = new DinnerHouseMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerHouseMenu);

        waitress.printMenu();
    }
}
