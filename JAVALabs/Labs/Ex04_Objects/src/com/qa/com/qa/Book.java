package com.qa.com.qa;

public class Book {

    private String name = "Harry Potter";
    private String author = "J K Rowling";
    private double price = 9.99;


    //constructor

    public Book(String name, String author, double price){
        System.out.println("Book was created");
        setName(name);
        setAuthor(author);
        setPrice(price);
    }

    //getters

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }


    //setters

    public void setName(String value){
        name = value;
    }

    public void setAuthor(String value){
        author = value;
    }

    public void setPrice(double value){
        price = value;
    }

    //toString method
    @Override
    public String toString(){
        return name + ", " + author + ", " + price;
    }
}
