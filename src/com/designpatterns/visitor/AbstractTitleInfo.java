package com.designpatterns.visitor;

public abstract class AbstractTitleInfo {
    private String titleName;

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public abstract void accept(TitleBlurbVisitor blrubVisitor);
}
