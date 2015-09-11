package com.dp.bridge.circle;

/**
 * Created by Sandeep on 09-09-2015.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
