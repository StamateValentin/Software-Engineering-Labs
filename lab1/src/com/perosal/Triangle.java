package com.perosal;

public class Triangle extends Shape {

    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        double area = (base * height) / 2;
        super.setArea(area);
        return area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
