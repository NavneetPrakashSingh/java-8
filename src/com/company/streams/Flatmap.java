package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Flatmap {
    public static void FlatMapExample() {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4);
        List<Integer> secondList = Arrays.asList(5, 6, 7);
        List<Integer> thirdList = Arrays.asList(1, 2);

        List<List<Integer>> listOfLists = Arrays.asList(firstList, secondList, thirdList);
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();
        listOfLists.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Flatmap.FlatMapExample();
    }
}
