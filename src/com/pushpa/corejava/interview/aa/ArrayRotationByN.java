package com.pushpa.corejava.interview.aa;

import java.util.Arrays;

public class ArrayRotationByN {
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Normalize rotation count if > n
        if (k < 0) k += n;

        reverse(arr, 0, n - 1);        // Reverse whole array
        reverse(arr, 0, k - 1);        // Reverse first k elements
        reverse(arr, k, n - 1);        // Reverse the rest of the elements
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 100;

        rotateRight(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
