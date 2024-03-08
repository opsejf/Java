package qa;

import java.util.Arrays;

public class E_PatternMatching {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] names = {"Adam", "Tommy", "Ali", "Tammy", "Alison", "Brad", "Prasad", "Timmy",
                "Mo", "Prithi", "Fiona", "George", "Geoff","Polly", "Harry", "Holly", "Ivor", "Billy",
                "Jim", "Geeta", "Petunia", "Dom", "Anita", "Tania", "Rita", "Simon","Sammy", "Sally",
                "Abbas", "Tom", "Tim", "Tina", "Vi", "Patricia", "Henry", "Hendry", "Lily", "Tatiana",
                "Florian", "Heavenly" };

        for(String name: names) {
            if (name.matches(".*[io]")) {
                System.out.println(name + " ends with i or o");
            }
            if (name.matches("..o.*")) {
                System.out.println(name + " has o in the 3rd character");
            }
            if (name.matches(".*m+.*")) {
                System.out.println(name + " has 1 or more m characters");
            }
            if (name.matches(".*it?a")) {
                System.out.println(name + " ends with ita or ia");
            }
            if (name.matches("T.*a")) {
                System.out.println(name + " starts with T and ends with a");
            }
            if (name.matches(".*l{2}y")) {
                System.out.println(name + " ends with lly");
            }
            if (name.matches(".*l{1,}y")) {
                System.out.println(name + " ends with at least 1 letter l, then y");
            }
            if (name.matches("H[aeo].*(l{1,}|r{1,})y")) {
                System.out.println(name + " starts with H, then a, e or o, and ends with at least 1 letter l or r, then y");
            }

        }
    }}
