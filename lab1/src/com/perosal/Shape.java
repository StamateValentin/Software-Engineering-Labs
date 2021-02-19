package com.perosal;

public abstract class Shape implements Figure {
    private double area;

    public Shape() {}

    protected void setArea(double area) {
        this.area = area;
    }

}
