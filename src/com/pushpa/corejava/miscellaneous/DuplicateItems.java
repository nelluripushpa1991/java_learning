package com.pushpa.corejava.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateItems {
    public static void main(String[] args) {
        List<Integer> integerList = Stream.of(1,2,3,1,5,2,6,3).toList();

        Map<Integer, Long> duplicateIntegerList = integerList.stream().collect(Collectors.groupingBy(intger -> intger,Collectors.counting()));
        duplicateIntegerList.entrySet().stream().forEach(i-> System.out.println("values : "+i));
    }
}
