package com.pushpa.corejava.miscellaneous;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCountString {
    public static void main(String[] args) {
        String input = "programming";

        // Find duplicate characters
        Map<Character, Long> duplicates = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        // Filter and print all characters count
        duplicates.entrySet().stream()
                //.filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println("************************************************");
        // Filter and print only duplicate characters
        duplicates.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
