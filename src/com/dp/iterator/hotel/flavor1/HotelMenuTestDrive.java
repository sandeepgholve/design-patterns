package com.dp.iterator.hotel.flavor1;

/**
 * Created by sandeep on 22/8/15.
 */
public class HotelMenuTestDrive {
    public static void main(String[] args) {
        DinnerHouseMenu dinnerHouseMenu = new DinnerHouseMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerHouseMenu);

        waitress.printMenu();
    }
}
