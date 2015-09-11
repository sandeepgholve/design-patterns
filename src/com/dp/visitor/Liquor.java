package com.dp.visitor;

/**
 * Created by sgholve on 9/11/15.
 */
public class Liquor implements Visitable {
    private double price;

    public Liquor(double item) {
        price = item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
