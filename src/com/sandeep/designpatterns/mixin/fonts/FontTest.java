package com.sandeep.designpatterns.mixin.fonts;

/**
 * Created by sgholve on 11/13/14.
 */
public class FontTest {
    public static void main(String[] args) {
        for (MonoFont font : BasicMonoFont.values()) {
            System.out.println(font);

            switch (font.getFontName()) {
                case "Courier":
                    System.out.println("Its Courier");
                    break;
                default:
                    System.out.println("Other than Courier");
                    break;
            }
        }

        MonoFont currentFont = BasicMonoFont.monoFontFor("Courier");
        System.out.println("Current Font = " + currentFont);
    }
}
