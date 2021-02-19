package com.perosal;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setWidth(side);
        super.setHeight(side);
    }

    public double getSide() {
        return side;
    }

}
