package com.sandeep.designpatterns.mixin.fonts;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sgholve on 11/13/14.
 */
public enum BasicMonoFont implements MonoFont {
    Courier("Courier", new File("/usr/share/fonts")),
    Consolas("Consolas", new File("/usr/share/fonts")),
    DejaVu("DejaVu", new File("/usr/share/fonts"));

    private static Map<String, MonoFont> fontMap = new TreeMap<>();

    private final String fontName;
    private final File location;

    static {
        for (MonoFont font : values()) {
            fontMap.put(font.getFontName(), font);
        }
    }

    public static MonoFont monoFontFor(String fontName) {
        return fontMap.get(fontName);
    }

    public static void addNewFont(MonoFont font) {
        if (!fontMap.containsKey(font.getFontName())) {
            fontMap.put(font.getFontName(), font);
        }
    }

    public static Collection<MonoFont> fonts() {
        return fontMap.values();
    }

    private BasicMonoFont(String fontName, File location) {
        this.fontName = fontName;
        this.location = location;
    }

    @Override
    public String getFontName() {
        return fontName;
    }

    @Override
    public File getLocation() {
        return location;
    }
}
