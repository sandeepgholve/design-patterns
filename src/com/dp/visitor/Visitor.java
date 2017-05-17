package com.dp.visitor;

/**
 * Created by sgholve on 9/11/15.
 */
public interface Visitor {
    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
