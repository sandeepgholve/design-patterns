package com.designpatterns.visitor;

public class LongTitleBlurbVisitor extends TitleBlurbVisitor {
    @Override
    public void visit(BookInfo bookInfo) {
        this.setTitleBlurb("LB_" + bookInfo.getTitleName() + "_" + bookInfo.getAuthor());
    }

    @Override
    public void visit(DvdInfo dvdInfo) {
        this.setTitleBlurb("LB_" + dvdInfo.getTitleName() + "_" + dvdInfo.getStar() + "_" + dvdInfo.getEncodingRegion());
    }

    @Override
    public void visit(GameInfo gameInfo) {
        this.setTitleBlurb("LB_" + gameInfo.getTitleName());
    }
}
