package com.pushpa.corejava.interview.aa;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterGroupCount {
    public static void main(String[] args) {
        String input = "aaabbbbccccc";
        int groupValue = 2;

        Map<Character, Long> charCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCounts.entrySet().stream().forEach(entry-> System.out.println("Before : "+entry.getKey()+" : "+entry.getValue()));

        Map<Character, Long> groupedCounts = charCounts.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> (entry.getValue() + groupValue - 1) / groupValue // Calculate grouped count
                ));

        groupedCounts.forEach((character, groupedCount) ->
                System.out.println("After : "+character + ": " + groupedCount));
    }
}
