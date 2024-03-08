package com.qa;

public abstract class Shape {

    private String name;
    private String colour;
    private double x;
    private double y;

    //getters

    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //setters

    public void setName(String value){
        name = value;
    }

    public void setColour(String value){
        colour = value;
    }

    public void setX(double value){
        x = value;
    }

    public void setY(double value){
        y = value;
    }

    //constructor

    public Shape(String name, String colour, double x, double y){
        setName(name);
        setColour(colour);
        setX(x);
        setY(y);
    }


    //tostring


    @Override
    public String toString() {
        return name + ", " + colour + ", " + x + ", " + y;
    }


    //abstract classes
    public abstract double getArea();
    public abstract double getCentrePoint();



}
