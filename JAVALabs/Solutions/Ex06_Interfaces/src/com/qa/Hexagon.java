package com.qa;

public class Hexagon extends Shape implements ConsoleLoggable, TimeLoggable{
    private double side1, side2, side3, side4, side5, side6;

    @Override
    public void log(String msg) {
        TimeLoggable.super.log(msg);
    }


    public Hexagon(String name, String colour, double x, double y, double side1, double side2, double side3, double side4, double side5, double side6) {
        super(name, colour, x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", side4=" + side4 +
                ", side5=" + side5 +
                ", side6=" + side6 +
                '}';
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public double getSide5() {
        return side5;
    }

    public void setSide5(double side5) {
        this.side5 = side5;
    }

    public double getSide6() {
        return side6;
    }

    public void setSide6(double side6) {
        this.side6 = side6;
    }
    @Override
    public double getArea() {
        // to be developed
        return 0;
    }

    @Override
    public Point getCentrePoint() {
        // to be developed
        return null;
    }

 }
