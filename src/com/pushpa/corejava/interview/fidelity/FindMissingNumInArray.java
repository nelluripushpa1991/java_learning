package com.pushpa.corejava.interview.fidelity;

public class FindMissingNumInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,10};
        System.out.println("Missing Number : "+findMissingNumber(arr));
    }

    public static int findMissingNumber(int [] arr) {
        int actualSum = 0, n = arr.length+1;
        int expectedSum = n * (n + 1) / 2;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
