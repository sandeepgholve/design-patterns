package com.dp.visitor;

/**
 * Created by sgholve on 9/11/15.
 */
public interface Visitable {
    double accept(Visitor visitor);
}
