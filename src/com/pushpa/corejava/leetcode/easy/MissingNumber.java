package com.pushpa.corejava.leetcode.easy;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,2,4,5}));
    }

    public static int missingNumber(int [] numbers) {
        int n = numbers.length;
        int sum = n*(n+1)/2;
        for (int num: numbers) {
            sum -= num;
        }
        return sum;
    }
}
