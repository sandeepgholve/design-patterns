package com.dp.bridge.circle;

/**
 * Created by Sandeep on 09-09-2015.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(new GreenCircle(), 5, 2,3);
        Shape redCircle = new Circle(new RedCircle(), 10, 5,8);
        greenCircle.draw();
        redCircle.draw();
    }
}
