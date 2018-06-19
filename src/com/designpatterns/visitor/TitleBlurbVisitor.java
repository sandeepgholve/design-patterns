package com.designpatterns.visitor;

/**
 * This abstract visitor class supports promotional creative work for given item
 */
public abstract class TitleBlurbVisitor implements Visitor {
    private String titleBlurb;

    public String getTitleBlurb() {
        return titleBlurb;
    }

    public void setTitleBlurb(String titleBlurb) {
        this.titleBlurb = titleBlurb;
    }

}
