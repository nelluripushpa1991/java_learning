package com.pushpa.corejava.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortOddNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,5,3,2,9,7,5,6};
        int[] sortedArray = sortOddNumbers(array);
        System.out.println(Arrays.toString(sortedArray)); // Output: [1, 2, 3, 5, 2, 5, 7, 9, 6]
    }
    public static int[] sortOddNumbers(int[] arr) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        Collections.sort(oddNumbers);
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddNumbers.get(oddIndex++);
            }
        }
        return arr;
    }
}
