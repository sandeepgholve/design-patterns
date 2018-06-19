package com.designpatterns.visitor;

public interface Visitor {
    void visit(BookInfo bookInfo);
    void visit(DvdInfo dvdInfo);
    void visit(GameInfo gameInfo);

}
