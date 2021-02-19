package com.perosal;

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Square square) {
        width = square.getSide();
        height = square.getSide();
    }

    @Override
    public double computeArea() {
        double area = width *  height;
        super.setArea(area);
        return area;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle[] slitIntoTriangles() {
        Triangle[] triangles = new Triangle[2];

        triangles[0] = new Triangle(width, height);
        triangles[1] = new Triangle(width, height);

        return triangles;
    }

}
