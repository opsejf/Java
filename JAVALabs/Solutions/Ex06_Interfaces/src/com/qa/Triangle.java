package com.qa;

public class Triangle extends Shape implements ConsoleLoggable{
    private double side1, side2, side3;

    public Triangle(String name, String colour, double x, double y, double side1, double side2, double side3) {
        super(name, colour, x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        // Heron's formula
        return 0.25 * Math.sqrt((4 * side1 * side1 * side2 * side2) -
                Math.pow(((side1 * side1) + (side2 * side2) - (side3 * side3)), 2) );
    }

    @Override
    public Point getCentrePoint() {
        // to be developed
        return null;
    }
}
