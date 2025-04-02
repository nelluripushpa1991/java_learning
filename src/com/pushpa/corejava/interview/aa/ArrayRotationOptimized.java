package com.pushpa.corejava.interview.aa;

import java.util.Arrays;

public class ArrayRotationOptimized {
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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 4; // Number of rotations

        rotateArray(arr, d);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
