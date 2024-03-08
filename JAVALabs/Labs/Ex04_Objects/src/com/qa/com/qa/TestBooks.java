package com.qa.com.qa;

import java.util.ArrayList;

public class TestBooks {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "J K Rowling", 9.99);

        Book book2 = new Book("The Hunger Games", "Suzanne Collins", 8.99);

        Book[] bookList = new Book[3];

        bookList[0] = book1;
        bookList[1] = book2;

        for(int i=0; i<2; i++){
            System.out.println(bookList[i]);
        }



        Film film1 = new Film("The Shawshank Redemption", 9.3, 1994);
        Film film2 = new Film("The Godfather", 9.2, 1972);

        Film[] filmList = new Film[3];

        filmList[0] = film1;
        filmList[1] = film2;

        for(int i=0; i<2; i++){
            System.out.println(filmList[i]);
        }


    }
}
