package com.pushpa.corejava.streams.processing;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
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
    }
}
