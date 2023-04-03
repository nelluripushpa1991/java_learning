package com.pushpa.corejava.streams.processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> G7Countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        //Covert to UpperCase
        G7Countries.stream().map(x -> x.toLowerCase()).forEach(s -> System.out.println(s));
        System.out.println("*********************************");

        //Covert to LowerCase
        G7Countries.stream().map(x -> x.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println("*********************************");

        //Print distinct list
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        numbers.stream().distinct().forEach(integer -> System.out.println(integer));
        System.out.println("*********************************");

        //print square of distinct values
        numbers.stream().map(x -> x*x).distinct().forEach(integer -> System.out.println(integer));
    }
}
