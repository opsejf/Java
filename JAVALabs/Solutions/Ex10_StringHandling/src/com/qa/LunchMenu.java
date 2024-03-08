package com.qa;

import java.util.ArrayList;

    public class LunchMenu {

        public static void main(String[] args) {
            // Ex1 Task1-2 ArrayList populated with lunch options
            ArrayList<String> lunches = new ArrayList<>();
            lunches.add("Salmon and cucumber sandwich");
            lunches.add("Tuna mayonnaise sandwich");
            lunches.add("Cucumber sandwich");
            lunches.add("Tomato sandwich");
            lunches.add("Roast beef sandwich");
            lunches.add("Hummus panini");
            lunches.add("Ready salted crisps");
            lunches.add("Cheese and onion crisps");
            lunches.add("Salt and vinegar crisps");
            lunches.add("Cola drink");
            lunches.add("Orange juice drink");
            lunches.add("Lemon juice drink");
            lunches.add("Lettuce, bacon and tomato sandwich");
            lunches.add("Salmon and cucumber sandwich with crisps");
            lunches.add("Salmon and cucumber sandwich with a drink");
            lunches.add("Salmon and cucumber sandwich with crisps and a drink");
            lunches.add("Tuna mayonnaise sandwich with crisps");
            lunches.add("Tuna mayonnaise sandwich with a drink");
            lunches.add("Tuna mayonnaise sandwich with crisps and a drink");
            lunches.add("Tomato sandwich with crisps");
            lunches.add("Tomato sandwich with a drink");
            lunches.add("Tomato sandwich with crisps and a drink");
            lunches.add("Cucumber sandwich with crisps");
            lunches.add("Cucumber sandwich with a drink");
            lunches.add("Cucumber sandwich with crisps and a drink");
            lunches.add("Roast beef sandwich with crisps");
            lunches.add("Roast beef sandwich with a drink");
            lunches.add("Roast beef sandwich with crisps and a drink");
            lunches.add("Hummus panini with crisps");
            lunches.add("Hummus panini with a drink");
            lunches.add("Hummus panini with crisps and a drink");
            lunches.add("Cheese roll with crisps");
            lunches.add("Cheese roll with a drink");
            lunches.add("Cheese roll with crisps and a drink");
            lunches.add("Bacon, lettuce and tomato sandwich with crisps");
            lunches.add("Bacon, lettuce and tomato sandwich with a drink");
            lunches.add("Bacon, lettuce and tomato sandwich with crisps and a drink");
            lunches.add("Feta panini with crisps");
            lunches.add("Feta panini with a drink");
            lunches.add("Feta panini with crisps and a drink");
            // Ex1 Task1-3  Print the list
            System.out.println(lunches);
            // Ex1 Task2-1  Sandwiches in upper case, else lower case
            for(String lunch: lunches) {
                if (lunch.contains("sandwich")) {
                    System.out.println(lunch.toUpperCase());
                } else {
                    System.out.println(lunch.toLowerCase());
                }
            }
            // Ex1 Task2-2  List of sandwich options
            System.out.println("Sandwich Options");
            for(String lunch: lunches) {
                if (lunch.contains("sandwich")) {
                    System.out.println(lunch.substring(lunch.indexOf("sandwich")));
                }
            }
            // Ex1 Task2-2c All sandwich options with filling output last
            System.out.println("Sandwich Options");
            for(String lunch: lunches) {
                if (lunch.contains("sandwich")) {
                    System.out.println(lunch.substring(lunch.indexOf("sandwich")) + ": " +
                            lunch.substring(0, lunch.indexOf("sandwich")));
                }
            }
            // Ex1 Task2-3 All panini options with filling output last
            System.out.println("Panini Options");
            for(String lunch: lunches) {
                if (lunch.contains("panini")) {
                    System.out.println(lunch.substring(lunch.indexOf("panini")) + ": " +
                            lunch.substring(0, lunch.indexOf("panini")));
                }
            }
            // Ex1 Task3-1 Meal options printed in full
            System.out.println("Full Meal Options");
            for(String lunch: lunches) {
                if (lunch.matches(".*(sandwich|panini|roll).*crisps.*drink")) {
                    System.out.println(lunch);
                }
            }
            // Ex1 Task3-1c Meal options omitting extras
            System.out.println("Full Meal Options with crisps and a drink");
            for(String lunch: lunches) {
                if (lunch.matches(".*(sandwich|panini|roll).*crisps.*drink")) {
                    System.out.println(lunch.substring(0, lunch.indexOf(" with")));
                }
            }
        }

    }

