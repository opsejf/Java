package com.qa.com.qa;

public class Film {

    private String name;
    private double rating;
    private int year;

    //getters

    public String getName(){
        return name;
    }

    public double getRating(){
        return rating;
    }

    public int getYear(){
        return year;
    }


    //setters

    public void setName(String value){
        name = value;
    }

    public void setRating(double value){
        rating = value;
    }

    public void setYear(int value){
        year = value;
    }



    //constructor

    public Film(String name, double rating, int year){
        setName(name);
        setRating(rating);
        setYear(year);
    }


    //toString


    @Override
    public String toString() {
        return name + ", " + rating + ", " + year;
    }
}
