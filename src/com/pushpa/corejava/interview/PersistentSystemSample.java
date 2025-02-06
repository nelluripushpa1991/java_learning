package com.pushpa.corejava.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersistentSystemSample {
    public static void main(String[] args) {
        String word = "DALLAS";
        Map<Character, Long> charCounts = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("charCounts : "+charCounts);
        charCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

}