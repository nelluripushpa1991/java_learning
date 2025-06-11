package com.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apricot");
        // char occurrences using groupingBy()
        Map<Character, Long> collect = input.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("using groupingBy() : "+collect);

        // char occurrences using reduce()
        Map<Character, Integer> result = input.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .reduce(
                        new HashMap<Character, Integer>(), // identity
                        (map, ch) -> {
                            map.put(ch, map.getOrDefault(ch, 0) + 1);
                            return map;
                        },
                        (map1, map2) -> {
                            map2.forEach((k, v) ->
                                    map1.merge(k, v, Integer::sum)
                            );
                            return map1;
                        }
                );

        System.out.println("using reduce() : "+result);
    }


}
