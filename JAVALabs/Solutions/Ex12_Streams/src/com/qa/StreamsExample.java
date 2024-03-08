package com.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Ex12-1  Task1-1
public class StreamsExample {
    public static void main(String[] args) {
        // Ex12-1  Task1-2
        IntStream years = IntStream.range(1960, 2050);
        // Ex12-1  Task1-4
        years.filter(y -> (y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
                // Ex12-1  Task1-2
             .forEach(System.out::println);
        // Ex12-1  Task2-2
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Eve", 19, 10000));
        personList.add(new Person("Alice", 24, 15000));
        personList.add(new Person("Dave", 27, 48000));
        personList.add(new Person("Mallory", 42, 18000));
        personList.add(new Person("Ami", 50, 50000));
        personList.add(new Person("Bob", 39, 17000));
        personList.add(new Person("Chris", 31, 19000));
        // Ex12-1  Task2-3
        System.out.println(personList);
        // Ex12-1  Task3-1
        personList.stream()
                  .filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
                  .forEach(System.out::println);
        // Ex12-1  Task3-2
        personList.stream()
                  .filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
                  .map(p -> p.getName())
                  .forEach(System.out::println);
        // Ex12-1  Task3-3
        List<String> namesList = personList.stream()
                                           .filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
                                           .map(p -> p.getName())
                                           .collect(Collectors.toList());
        System.out.println("New List of Names: " + namesList);
        // Ex12-1  Task3-4
        personList.stream()
                  .filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
                  .map(p -> new Person(p.getName(), p.getAge(), p.getSalary() * 1.10))
                  .sorted()
                  .forEach(System.out::println);

        // Ex12-1  Task3-5
        List<Person> incSalPersonList = personList
                  .stream()
                  .filter(p -> p.getAge() > 30 && p.getSalary() < 20000)
                  .map(p -> new Person(p.getName(), p.getAge(), p.getSalary() * 1.10))
                  .sorted()
                  .collect(Collectors.toList());
        System.out.println(incSalPersonList);
        // Ex12-1  Task3-6
        String summaryStats = personList
                .stream()
                .filter(p -> p.getAge() < 30)
                .collect(Collectors.summarizingDouble((Person p) -> p.getSalary()))
                .toString();
        System.out.println("Summary statistics of those uder 30: " + summaryStats);
        // Ex12-1  Task3-7
        double avgSalUnder30 = personList
                  .stream()
                  .filter(p -> p.getAge() < 30)
                  .collect(Collectors.summarizingDouble((Person p) -> p.getSalary()))
                  .getAverage();
        System.out.println("Average salary of those under 30 is " + Math.round(avgSalUnder30));
        // Ex12-1  Task3-8
        System.out.println("Average salary of those over 30 is " + Math.round(personList
                .stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.summarizingDouble((Person p) -> p.getSalary()))
                .getAverage())
        );

        // Ex12-2  Task1-3
        ArrayList<Integer> intList = new ArrayList<>(IntStream.range(0, 10)
                                                              .boxed()
                                                              .collect(Collectors.toList()));
        // Ex12-2  Task1-4
        System.out.println(intList);
        // Ex12-2  Task1-5
        ArrayList<Integer> oneUp = applyFunction(intList, i -> i = i + 1);
        // Ex12-2  Task1-6
        System.out.println(oneUp);
        // Ex12-2  Task1-7
        ArrayList<Integer> doubleUp = applyFunction(intList, i -> i = i * 2);
        // Ex12-2  Task1-8
        System.out.println(doubleUp);
        // Ex12-2  Task1-9
        ArrayList<Integer> squares = applyFunction(intList, i -> i = i * i);
        // Ex12-2  Task1-10
        System.out.println(squares);
    }

    // Ex12-2  Task1-1
    public static ArrayList<Integer> applyFunction(ArrayList<Integer> input,
                                                   Function<Integer, Integer> f) {
        // Ex12-2  Task1-2
        return new ArrayList<Integer>(input.stream()
                                           .map(f)
                                           .collect(Collectors.toList()));

    }


}

