package com.dp.bridge.circle;

/**
 * Created by Sandeep on 09-09-2015.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Red Circle: With Radius - " + radius + ", and at point - " + x + ":" + y);
    }
}
