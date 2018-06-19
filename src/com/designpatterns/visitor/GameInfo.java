package com.designpatterns.visitor;

public class GameInfo extends AbstractTitleInfo {
    public GameInfo(String title) {
        this.setTitleName(title);
    }

    @Override
    public void accept(TitleBlurbVisitor blrubVisitor) {
        blrubVisitor.visit(this);
    }
}
