package com.pushpa.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseOfList {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("pushpa");
        sList.add("pqr");
        sList.add("abc");
        sList.add("xyz");
        System.out.println("Before Reversal : "+sList);
        List<String> reverseList = IntStream.range(0,sList.size()).map(i -> sList.size()-1-i).mapToObj(sList::get).toList();
        // A,B,C,D ----> D,C,B,A
//        0,4.map(3).mapToObj(get(3)).collect({D})
//        0,4.map(2).mapToObj(get(2)).collect({D,C})
//        0,4.map(1).mapToObj(get(1)).collect({D,C,B})
//        0,4.map(0).mapToObj(get(0)).collect({D,C,B,A})
        System.out.println("After Reversal : "+reverseList);
    }


}
