package com.pushpa.corejava.streams.processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

        //Remove empty values in list
        List<String> list = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("List with out empty values "+list);

        //Print list with more than 2 chars
        List<String> list1 = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println("List has more than 2 chars : "+list1);

        List<String> G7Countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        //Covert to UpperCase
        List<String> uppList = G7Countries.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println("Uppercase : "+uppList);

        //Covert to LowerCase
        List<String> lowList = G7Countries.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println("Lowercase : "+lowList);

        //Print distinct list
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinctList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctList : "+distinctList);

        //print square of distinct values
        List<Integer> squareDistinctValues = numbers.stream().map(x -> x*x).distinct().collect(Collectors.toList());
        System.out.println("squareDistinctValues : "+squareDistinctValues);

    }
}
