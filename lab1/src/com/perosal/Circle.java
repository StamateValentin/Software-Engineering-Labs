package com.perosal;

public class Circle extends Shape {

    private double radius;
    public double PI = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        double area = PI * radius * radius;
        super.setArea(area);
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
