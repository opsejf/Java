package lambdas;

import java.util.ArrayList;

public class A_LambdaExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rod");
        names.add("Roger");
        names.add("Rover");
        names.add("Adam");
        names.add("Ben");
        names.add("Abbas");
        names.add("Sumira");
        names.add("Chris");
        names.add("Di");
        names.add("Dan");
        names.add("Sam");

        System.out.println("Original Names");
        System.out.println(names);

        names.replaceAll(s -> s.toUpperCase());
        System.out.println("Names changed to upper case");
        System.out.println(names);

        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Names sorted");
        System.out.println(names);


        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Names sorted in reverse");
        System.out.println(names);

        names.removeIf(s -> s.startsWith("R"));
        System.out.println("Names without initial R");
        System.out.println(names);


    }
}
