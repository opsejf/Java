package com.qa;

public class Point {

    private double x;
    private double y;

    //getters

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //setters

    public void setX(double value){
        x = value;
    }

    public void setY(double value){
        y = value;
    }


    //constructor

    public Point(double x, double y){
        setX(x);
        setY(y);
    }


    //tostring


    @Override
    public String toString() {
        return x + ", " + y;
    }

}
