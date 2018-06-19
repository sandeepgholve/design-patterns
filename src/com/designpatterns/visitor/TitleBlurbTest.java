package com.designpatterns.visitor;

public class TitleBlurbTest {
    public static void main(String[] args) {
        AbstractTitleInfo dilCahataHai =
                new DvdInfo("Dill Cahata Hai", "Amir Khan, Akshat Khanna and Saif Ali Khan", "IN");
        AbstractTitleInfo electricSheep =
                new BookInfo("Do Androids Dream of Electric Sheep?", "Phillip K. Dick");
        AbstractTitleInfo sheepRaider = new GameInfo("Sheep Raider");

        TitleBlurbVisitor titleLongBlurbVisitor = new LongTitleBlurbVisitor();
        System.out.println("######## LONG ###########");
        dilCahataHai.accept(titleLongBlurbVisitor);
        System.out.println("Testing dilCahataHai   " + titleLongBlurbVisitor.getTitleBlurb());
        electricSheep.accept(titleLongBlurbVisitor);
        System.out.println("Testing electricSheep " + titleLongBlurbVisitor.getTitleBlurb());
        sheepRaider.accept(titleLongBlurbVisitor);
        System.out.println("Testing sheepRaider   " + titleLongBlurbVisitor.getTitleBlurb());

        TitleBlurbVisitor titleShortBlurbVisitor = new ShortTitleBlurbVisitor();
        System.out.println("######## SHORT ###########");
        dilCahataHai.accept(titleShortBlurbVisitor);
        System.out.println("Testing dilCahataHai   " + titleShortBlurbVisitor.getTitleBlurb());
        electricSheep.accept(titleShortBlurbVisitor);
        System.out.println("Testing electricSheep " + titleShortBlurbVisitor.getTitleBlurb());
        sheepRaider.accept(titleShortBlurbVisitor);
        System.out.println("Testing sheepRaider   " + titleShortBlurbVisitor.getTitleBlurb());
    }
}
