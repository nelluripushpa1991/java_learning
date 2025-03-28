package com.pushpa.corejava.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateItems {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,1,5,2,6,3);

        Map<Integer, Long> duplicateIntegerList = integerList.stream().collect(Collectors.groupingBy(intger -> intger,Collectors.counting()));
        duplicateIntegerList.entrySet().stream().forEach(i-> System.out.println("values : "+i));
    }
}
