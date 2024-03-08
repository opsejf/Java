package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        // Demo 12 - Streams
        // Collections have new method stream()
        // Converts collection into stream of values

        myList	.stream()			// Start the stream
                .map(String::toUpperCase)	// Demo  - Map the stream - take each element and apply function to it
                .filter(s -> s.startsWith("C"))	// Demo  - Filter the list
                .sorted()			// Demo  - Sort the list
                .forEach(System.out::println);	// Output myList

        // Demo  - Collect - gather output of map and filter and collect in required form
        List<Integer> mapFilterList = intList.stream()
                .map(i -> i * i)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(mapFilterList);

        // Demo  - Collect
        String total = intList.stream()
                .map(i -> i * i)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.summarizingInt(i -> i))
                //		      .collect(Collectors.averagingInt(i -> i))
                .toString();
        System.out.println("Statistics: " + total);

        // Demo  - Reduce - reduce stream according to function
        Integer reducedList = intList.stream().reduce(1, (x, a) -> a * x);
        System.out.println("Output: " + reducedList);

        System.out.println();

        Stream <Boolean> isEven = intList.stream().map(i -> i % 2 == 0);
        isEven.forEach(s -> System.out.print(s + ","));

        System.out.println();

        Stream <Integer> isEvenInt = intList.stream().filter(i -> i % 2 == 0);
        isEvenInt.forEach(i -> System.out.print(i + ","));

        System.out.println();

        intList.stream().map(i -> i * i).filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
