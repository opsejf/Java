package com.qa;

import java.util.ArrayList;
import java.util.Collections;

// Ex1 Task 1-1
public class LambdaExample {
    public static void main(String[] args) {
        // Ex1 Task1-3
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Eve", 19, 10000, false));
        personList.add(new Person("Alice", 24, 15000, false));
        personList.add(new Person("Dave", 27, 48000, false));
        personList.add(new Person("Mallory", 57, 18000, false));
        personList.add(new Person("Ami", 50, 50000, true));
        personList.add(new Person("Bob", 39, 17000, false));
        personList.add(new Person("Chris", 62, 50000, true));
        personList.add(new Person("Fran", 39, 17000, false));
        // Ex1 Task1-4
        System.out.println("Initial List:\n" + personList);
        // Ex1 Task1-5
        personList.removeIf(p -> (p.isDueForRetirement() && p.getAge() >= 55));
        // Ex1 Task1-6
        System.out.println("Without retirees:\n" + personList);
        // Ex1 Task1-7
        Collections.sort(personList);
        System.out.println("Sorted by name using Collections.sort():\n" + personList);
        // Ex1 Task1-8
        personList.sort((p1, p2) -> p1.compareTo(p2));
        System.out.println("Sorted by name using List's sort():\n" + personList);
        // Ex1 Task1-9
        personList.sort((p1, p2) -> p1.getAge()-p2.getAge());
        // Ex1 Task1-10
        System.out.println("Sorted by age using List's sort():\n" + personList);
        // Ex1 Task1-11
        personList.replaceAll(p -> new Person(p.getName(),
                              p.getAge(),
                        p.getSalary() * 1.1,
                              p.isDueForRetirement()));
        // Ex1 Task1-12
        System.out.println("After salary increases:\n" + personList);
    }

}
