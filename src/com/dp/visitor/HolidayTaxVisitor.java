package com.dp.visitor;

import java.text.DecimalFormat;

/**
 * Created by sgholve on 9/11/15.
 */
public class HolidayTaxVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(df.format((liquor.getPrice() * .10) + liquor.getPrice()));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(df.format((tobacco.getPrice() * .20) + tobacco.getPrice()));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(df.format((necessity.getPrice() * 0) + necessity.getPrice()));
    }
}
