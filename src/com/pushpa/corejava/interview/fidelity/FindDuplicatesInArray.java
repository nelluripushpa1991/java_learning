package com.pushpa.corejava.interview.fidelity;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        findDuplicatesInArray(new int[]{1,3,5,6,3,6,2,5,7});
    }

    public static void findDuplicatesInArray(int [] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num))
                duplicates.add(num);
        }
        System.out.println("duplicates : "+duplicates);
    }
}
