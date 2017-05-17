package com.dp.visitor;

/**
 * Created by sgholve on 9/11/15.
 */
public class VisitorDemoTest {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        HolidayTaxVisitor holidayTaxVisitor = new HolidayTaxVisitor();

        Liquor vodka = new Liquor(10);
        Tobacco cigar = new Tobacco(5);
        Necessity milk = new Necessity(1);

        System.out.println(" -- NORMAL TAX -- ");
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigar.accept(taxVisitor));
        System.out.println(milk.accept(taxVisitor));
        System.out.println();

        System.out.println(" -- HOLIDAY TAX -- ");
        System.out.println(vodka.accept(holidayTaxVisitor));
        System.out.println(cigar.accept(holidayTaxVisitor));
        System.out.println(milk.accept(holidayTaxVisitor));
    }
}
