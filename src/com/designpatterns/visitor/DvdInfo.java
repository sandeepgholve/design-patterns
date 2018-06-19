package com.designpatterns.visitor;

public class DvdInfo extends AbstractTitleInfo {
    private String star;
    private String encodingRegion;

    public DvdInfo(String title, String star, String encodingRegion) {
        this.setTitleName(title);
        this.star = star;
        this.encodingRegion = encodingRegion;
    }

    public String getStar() {
        return star;
    }

    public String getEncodingRegion() {
        return encodingRegion;
    }

    @Override
    public void accept(TitleBlurbVisitor blrubVisitor) {
        blrubVisitor.visit(this);
    }
}
