package com.pushpa.corejava.miscellaneous;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintSortedMapByKey {

    public static void main(String[] args) {
        Map<String, Integer> unsortMap = new HashMap<>();
        Map<String, Integer> unsortMapReverse = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("Unsorted Map : "+unsortMap);
        unsortMapReverse = unsortMap;
        Map<String, Integer> sortedMapByKeyAsc = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(integer, integer2) -> integer, LinkedHashMap::new));
        System.out.println("SortedMap Using Key : "+sortedMapByKeyAsc);

        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> result2.put(x.getKey(),x.getValue()));
        System.out.println("different way : "+result2);



        //sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> result = unsortMapReverse.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        //Alternative way
        Map<String, Integer> result3 = new LinkedHashMap<>();
        unsortMapReverse.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .forEachOrdered(x -> result3.put(x.getKey(), x.getValue()));

        System.out.println("Reverse Sorted...");
        System.out.println(result);
        System.out.println(result3);


        Map<Integer, String> map = new HashMap<>();
        map.put(111,"abc");
        map.put(222,"xyz");
        map.put(333,"pqr");
        map.put(444,"mno");
        System.out.println(map);
        Map<Integer,String> reverseMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
        System.out.println(map);
        System.out.println(reverseMap);
    }
}
