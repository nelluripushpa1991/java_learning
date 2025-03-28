package com.pushpa.corejava.sample;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Store the last element
        int last = arr[n - 1];

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place last element at the first position
        arr[0] = last;

        // Print rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }


//    public void rotation() {
//
//        int [] arr = {1,2,3,4,5};
//        int k = 2;
//        int [] rotatedArr = new int[arr.length]; // {3,}
//
//        for (int i =0; i< arr.length; i++) {
//            if (k+i >= arr.length) {
//                k = k-1;
//            }
//            rotatedArr[k+i] = arr[i];
//        }
//        System.out.println(rotatedArr);
//    }
}
