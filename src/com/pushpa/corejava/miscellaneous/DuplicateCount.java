package com.pushpa.corejava.miscellaneous;

import java.util.*;
import java.util.stream.Collectors;

public class    DuplicateCount {
    public static void main(String[] args) {

//        Define and initialize an array or collection of integers with the following values: 10, 30, 2001, 2001, 400, 10, 6, 55, 2001, 55.
//
//        Write code that will count and display the number of time each number is repeated like this:
//
//
//        10 - 2
//        2001 - 3
//        30 - 1
//        400 - 1
//        55 - 2
//        6 - 1


        List<Integer> integerList = Arrays.asList(10, 30, 2001, 2001, 400, 10, 6, 55, 2001, 55);
        System.out.println("initial list : "+integerList);

        Map<Integer,Long> integerMap = new HashMap<>();
        integerMap = integerList.stream().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        System.out.println("after map "+integerMap);

        integerMap = integerList.stream().distinct().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        System.out.println("after distinct map "+integerMap);

    }
}
