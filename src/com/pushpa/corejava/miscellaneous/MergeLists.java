package com.pushpa.corejava.miscellaneous;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = Arrays.asList(4,5,6,4,7,8);
        List<Integer> allElements = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println("All Elements : "+allElements);
        Set<Integer> uniqueElements = allElements.stream().collect(Collectors.toSet());
        System.out.println("Unique Elements : "+uniqueElements);
        Integer minValue = uniqueElements.stream().min((e1,e2) -> e1-e2).get();
        System.out.println("Min Value : "+minValue);
        Integer maxValue = uniqueElements.stream().max((o1, o2) -> o1-o2).get();
        System.out.println("Max Value : "+maxValue);
        Map<Integer, Long> integerMap = allElements.stream().collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));
        System.out.println("Count for each integer : "+integerMap);
        Set<Integer> set = allElements.stream().filter(i -> Collections.frequency(allElements, i) > 1)
                .collect(Collectors.toSet());
        System.out.println("Only Duplicate elements :"+set);

        integerMap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " appears " + value + " times in the list.");
            }
        });
    }
}
