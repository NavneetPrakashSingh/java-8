package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Map {
    public static void mapExample() {
        List<Integer> first = Arrays.asList(1, 2, 3);
        List<Integer> second = Arrays.asList(4, 5, 6);
        List<Integer> third = Arrays.asList(1);

        Function<List<?>, Integer> size = List::size;
        List<List<Integer>> listOfLists = Arrays.asList(first, second, third);
        listOfLists.stream()
                .map(size)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Map.mapExample();
    }
}
