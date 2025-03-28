package com.pushpa.corejava.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[] {1,2,3,4,5,6,7,8,9,10}, 9);
        System.out.println("Method 1: " + Arrays.toString(twoSum));

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            System.out.println("complement : "+complement);
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
            map.entrySet().stream().forEach(entry -> System.out.println("key : "+entry.getKey()+" value : "+entry.getValue()));
        }
        return new int[]{};
    }
}
