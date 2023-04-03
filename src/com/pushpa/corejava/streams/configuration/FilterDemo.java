package com.pushpa.corejava.streams.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main (String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        //Counting empty string an eliminating empty strings
        long emptyCount = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.println("emptyCount : "+emptyCount);

        //Counting length more than 3 in list
        long moreThanThreeCount = strList.stream().filter(x -> x.length() > 3).count();
        System.out.println("moreThanThreeCount : "+moreThanThreeCount);

        //Counting string starts with "a" in list
        long countStartWithA = strList.stream().filter(x -> x.startsWith("a")).count();
        System.out.println("countStartWithA : "+countStartWithA);

        //Remove empty values in list
        List<String> list = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("List with out empty values "+list);

        //Print list with more than 2 chars
        List<String> list1 = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println("List has more than 2 chars : "+list1);
    }
}
