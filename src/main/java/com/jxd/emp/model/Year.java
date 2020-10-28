package com.jxd.emp.model;

public class Year {
    private int yId;
    private String yContent;

    public Year() {
    }

    public Year(int yId, String yContent) {
        this.yId = yId;
        this.yContent = yContent;
    }

    public int getyId() {
        return yId;
    }

    public void setyId(int yId) {
        this.yId = yId;
    }

    public String getyContent() {
        return yContent;
    }

    public void setyContent(String yContent) {
        this.yContent = yContent;
    }

}

