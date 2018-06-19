package com.designpatterns.visitor;

public class ShortTitleBlurbVisitor extends TitleBlurbVisitor {
    @Override
    public void visit(BookInfo bookInfo) {
        this.setTitleBlurb("S_" + bookInfo.getTitleName());
    }

    @Override
    public void visit(DvdInfo dvdInfo) {
        this.setTitleBlurb("S_" + dvdInfo.getTitleName());
    }

    @Override
    public void visit(GameInfo gameInfo) {
        this.setTitleBlurb("S_" + gameInfo.getTitleName());
    }
}
