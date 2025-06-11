package com.pushpa.corejava.miscellaneous;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostUsedWordInListOfStrings {
    public static void main(String[] args) {
        List<String> sList =  Arrays.asList("abc", "xyz", "pqr", "Loblaw", "mno", "Loblaw", "abc", "xyz", "xyz");
        // logic by using java 8 streams api
        String mostUsedWord = printMostUsedWord(sList);
        System.out.println("mostUsedWord using java8 streams: "+mostUsedWord);

        // logic by without using java 8
        String mostUsedWord1 = printMostUsedWordWithoutJava8(sList);
        System.out.println("mostUsedWord without using java8 and using for loop : "+mostUsedWord1);
    }

    // logic by using java 8 streams api
    public static String printMostUsedWord(List<String> list) {
        String mostUsedWord = null;
        Map<String, Long> duplicateCount = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        //System.out.println("duplicateCount : "+duplicateCount);
        Map<String,Long> dupCountMap = duplicateCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        //System.out.println("dupCountMap : "+dupCountMap);

        Optional<Map.Entry<String,Long>> firstEntry = dupCountMap.entrySet().stream().findFirst();
        //System.out.println("firstEntry : "+firstEntry);
        mostUsedWord = firstEntry.get().getKey();

        // optimized code
        Map.Entry<String, Long> stringLongEntry = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (m1, m2) -> m1, LinkedHashMap::new)).entrySet().stream().findFirst().get();
        System.out.println("sorted : "+stringLongEntry.getKey());
        return mostUsedWord;
    }

    // logic by without using java 8
    public static String printMostUsedWordWithoutJava8(List<String> list) {
        int freq = 0;
        String mostUsedWord1 = "";
        String [] array = list.toArray(new String[list.size()]);
        for (int i=0; i<array.length; i++) {
            int count = 0;
            for (int j=i+1; j<array.length; j++) {
                if(array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count > freq) {
                mostUsedWord1 = array[i];
                freq = count;
            }
        }
        return mostUsedWord1;
    }
}
