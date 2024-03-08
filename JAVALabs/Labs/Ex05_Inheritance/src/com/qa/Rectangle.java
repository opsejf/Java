package com.qa;

public class Rectangle extends Shape{

    //constructor

    public Rectangle(String name, String colour, double x, double y){ super(name, colour, x, y); };

    //tostring


    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }


    //issquare

    public boolean isSquare(){
        if(getX() == getY()){
            return true;
        }
        else{
            return false;
        }
    }

    public double getArea(){
        return getX()*getY();
    }

    public double

}
