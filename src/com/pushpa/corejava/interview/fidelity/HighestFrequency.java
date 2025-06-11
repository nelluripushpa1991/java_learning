package com.pushpa.corejava.interview.fidelity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 5, 4, 3, 4, 6, 6);
                Integer result =
                        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue)) // Group by frequency
                        //.forEach((k,v) -> System.out.println(k+" : "+v));
                .entrySet().stream()
                .max(Map.Entry.comparingByKey()) // Get max frequency
                .map(Map.Entry::getValue) // Get list of entries with max frequency
                .orElse(Collections.emptyList()).stream()
                                //.forEach((k) -> System.out.println(k+" : "));
                .min(Map.Entry.comparingByKey()) // Get entry with smallest number
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most frequent (least among ties): " + result);
    }
}
