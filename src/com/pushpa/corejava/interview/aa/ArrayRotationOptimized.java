package com.pushpa.corejava.interview.aa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotationOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotationCount = 4; // Number of rotations

        // way using System.arraycopy method, this will not work for the rotationCount more than array length
        rotateArray(arr, rotationCount);
        System.out.println("Rotated Array: " + Arrays.toString(arr));

        // another way using collections.rotate method
        moreOptimizedWay(arr, rotationCount);
    }

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[d];

        // Copy first d elements to temp
        System.arraycopy(arr, 0, temp, 0, d);

        // Shift remaining elements left
        System.arraycopy(arr, d, arr, 0, n - d);

        // Copy temp back to original array
        System.arraycopy(temp, 0, arr, n - d, d);
    }

    public static void moreOptimizedWay(int[] arr, int rotationCount) {
        // another way using collections.rotate method
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        Collections.rotate(list,rotationCount);
        System.out.println("More optimized way Rotated Array: " + list);
    }
}
