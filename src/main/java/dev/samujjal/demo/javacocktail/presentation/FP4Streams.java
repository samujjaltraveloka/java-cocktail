package dev.samujjal.demo.javacocktail.presentation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP4Streams {
    public static void main(String[] args) {

        Stream.of("1", "2", "3", "4", "5") // source
                .filter(s -> s.startsWith("1")) // intermediate operation
                .map(String::toUpperCase) // intermediate operation
                .sorted() // intermediate operation
                .forEach(System.out::println); // terminal operation

        Arrays.asList("1", "2", "3", "4", "5")
                .parallelStream() // parallel processing
                .filter(s -> s.startsWith("1"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        Stream.of("1", "2", "3", "4", "5")
                .parallel() // parallel processing
                .filter(s -> s.startsWith("1"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        Stream.of("1", "2", "3", "4", "5")
                .mapToInt(Integer::valueOf)
                .sum();
// Output: 15
        Stream.of("1", "2", "3", "4", "5")
                .mapToInt(Integer::valueOf)
                .reduce(0, (x,y) -> x+y);
// Output: 15
        Stream.of("R", "O", "B", "I", "N")
                .collect(Collectors.joining());
// Output: ROBIN
        Stream.of("R", "O", "B", "I", "N")
                .reduce("", (a,b)->a+b);
// Output: ROBIN

        // Map vs FlatMap

        List<Integer> listOfIntegers = Stream.of("1", "2", "3", "4") .map(Integer::valueOf) .collect(Collectors.toList());
        List<String> myList = Stream.of("a", "b")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
       list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
