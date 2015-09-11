package com.dp.visitor;

/**
 * Created by sgholve on 9/11/15.
 */
public class Necessity implements Visitable {
    private double price;

    public Necessity(double item) {
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
