package com.pushpa.corejava.interview.aa;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterGroupCount {
    public static void main(String[] args) {
        String input = "aaabbbbccccc";
        int groupValue = 2;
        getCharCountByGroupValue(input,groupValue);
    }

    public static void getCharCountByGroupValue(String str, int groupVal) {
        if (str != null && !str.isEmpty()) {
            Map<Character, Long> results = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, characterLongEntry -> (characterLongEntry.getValue() + groupVal - 1) / groupVal));
            System.out.println("results : "+results);
        }
    }
}
