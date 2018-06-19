package com.designpatterns.visitor;

public class BookInfo extends AbstractTitleInfo {
    private String author;

    public BookInfo(String title, String author) {
        this.setTitleName(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void accept(TitleBlurbVisitor blrubVisitor) {
        blrubVisitor.visit(this);
    }
}
