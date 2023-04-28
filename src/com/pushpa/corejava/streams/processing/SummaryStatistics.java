package com.pushpa.corejava.streams.processing;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatistics {
    public static void main(String[] args) {

        //print all Summary Statistics
        List<Integer> primesNumbers = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primesNumbers.stream().mapToInt((x) -> x).summaryStatistics();

        List<Integer> primesNumbers1 = Arrays.asList(35,37,41);
        IntSummaryStatistics stats1 = primesNumbers1.stream().mapToInt((x) -> x).summaryStatistics();


        System.out.println("Min : "+stats.getMin());
        System.out.println("Max : "+stats.getMax());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Average : "+stats.getAverage());
        System.out.println("Count : "+stats.getCount());
        stats.accept(31);
        System.out.println("After Count : "+stats.getCount());
        System.out.println("After Sum : "+stats.getSum());
        stats.combine(stats1);
        System.out.println("After Merge Count : "+stats.getCount());
        System.out.println("After Merge Sum : "+stats.getSum());

    }
}
