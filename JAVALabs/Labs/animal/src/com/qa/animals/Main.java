package com.qa.animals;


import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {


    static ArrayList<Animal> animalList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

//        HashMap<String, String> dictionary = new HashMap<String, String>();
//
//        dictionary.put("ABC", "123");
//        dictionary.put("XYZ", "789");
//
//        System.out.println(dictionary.get("ABC"));
//
//        System.out.println("Enter value to search for:");
//        String search = input.nextLine();
//
//        for(Map.Entry<String, String> item : dictionary.entrySet()){
//            //System.out.println(item.getKey() + " = " + item.getValue());
//            if(search.equals(item.getValue())){
//                System.out.println(item.getKey());
//            }
//        }

        HashSet<String> listItems = new HashSet<>();
        listItems.add("ABC");
        listItems.add("DEF");
        listItems.add("GHI");

        System.out.println(listItems);
        System.out.println(listItems.contains("DEF"));

        listItems.remove("DEF");
        System.out.println(listItems);
        System.out.println(listItems.contains("DEF"));



        //abstract animal stops this from being allowed:
        //Animal myPet = new Animal("Barney", 5, "dsfhoiubf");
        //System.out.println(myPet.getSound());


        //Animal myPet = new Animal("Barney", 5, "woof");
        //Animal yourPet = new Animal();
        //following lines of code, now replace the 2 above
        //animalList.add(new Animal("Barney", 5, "woof"));
        //animalList.add(new Animal("Fluffy", 7, "bark"));
        //animalList.add(new Animal());

        loop:while(true) {
            System.out.println("**** MAIN MENU ****");
            System.out.println("1. Add animal to list.");
            System.out.println("2. Show list");
            System.out.println("3. Exit");
            System.out.println("Enter an option:");

            switch(input.nextLine()){
                case "1":
                    createAnimal();
                    break;
                case "2":
                    listAnimals();
                    break;
                case "3":
                    break loop;
            }
        }



        //every item from animalList will be passed through to item, this is a for each, but we are using the for
        //loop above for now so this is commented out, but it does the same as the for loop above
//        for(Animal item : animalList){
//            System.out.println(item.getName());
//        }



        //if the below code was written myPet.name, name would be red because we made it private, and
        //prompts programmer to use the getter instead
        //System.out.println( myPet.getName() );




    }

    static void listAnimals(){
        for(int i=0; i<animalList.size(); i++){
            System.out.println( animalList.get(i).getName() + " = " + animalList.get(i).getSound());
        }
    }

    static void createAnimal(){

        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("Age: ");
        int age = parseInt(input.nextLine()); //parseint changes from string to int, needs import at top

        System.out.println("Animal type: ");
        switch(input.nextLine().toUpperCase()){
            case "CAT":
                animalList.add(new Cat(name, age));
                break;
            case "DOG":
                animalList.add(new Dog(name, age));
                break;
            default:
                System.out.println("Animal type unknown.");
        }

    }


}