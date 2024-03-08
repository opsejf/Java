package qa;

public class WhatClass {
    public static void main(String[] args) {
        // Demo 6.17 What Class Am I?

        Dog d = new Dog("Spot", 2);

        System.out.println(d.getClass());

        if(d instanceof Dog) {
            System.out.println(d.getName() + " is a Dog");
            System.out.println("Working? " + d.working()
                    + " Crossing? " + d.crossRoad());
        }

        if(d instanceof GuideDog) {
            System.out.println(d.getName() + " is also a GuideDog");
        }

        if(d instanceof RetiredGuideDog) {
            System.out.println(d.getName() + " is also a RetiredGuideDog");
        } else {
            System.out.println(d.getName() + "... is not a RetiredGuideDog");
        }


        if(d instanceof Animal) {
            System.out.println(d.getName() + " is also an Animal");

        }

    }

}
