package com.dp.bridge.circle;

/**
 * Created by Sandeep on 09-09-2015.
 */
public class Circle extends Shape {
    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
