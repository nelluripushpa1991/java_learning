package com.pushpa.corejava.streams.processing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","xyz","pqr","mno");
        System.out.println("given list of integer : "+list);

        List<String> naturalSortList = list.stream().sorted().collect(Collectors.toList());
        List<String> reverseList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("list data after "+list);
        System.out.println("natural sort oder string : "+naturalSortList);
        System.out.println("reverse sort order string"+reverseList);

        System.out.println("***************************************************###############################");
        List<Integer> list1 = Arrays.asList(555,333,111,666,222);

        System.out.println("given list of string : "+list1);
        List<Integer> naturalSortList1 = list1.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseList1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("natural sort order integer : "+naturalSortList1);
        System.out.println("reverse sort order integer : "+reverseList1);

    }
}
