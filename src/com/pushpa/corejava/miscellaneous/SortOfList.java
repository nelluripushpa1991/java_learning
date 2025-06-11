package com.pushpa.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOfList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        list.add("pqr");
        System.out.println("given list of integer : "+list);
        List<String> naturalSortList = list.stream().sorted().toList();
        List<String> reverseList = list.stream().sorted(Comparator.reverseOrder()).toList();
        list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("list data after "+list);
        System.out.println("natural sort oder string : "+naturalSortList);
        System.out.println("reverse sort order string"+reverseList);

        System.out.println("***************************************************###############################");
        List<Integer> list1 = new ArrayList<>();
        list1.add(555);
        list1.add(333);
        list1.add(666);

        System.out.println("given list of string : "+list1);
        List<Integer> naturalSortList1 = list1.stream().sorted().toList();
        List<Integer> reverseList1 = list1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("natural sort order integer : "+naturalSortList1);
        System.out.println("reverse sort order integer : "+reverseList1);
    }
}
