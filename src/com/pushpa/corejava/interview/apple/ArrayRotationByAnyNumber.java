package com.pushpa.corejava.interview.apple;

import java.util.Arrays;

public class ArrayRotationByAnyNumber {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5};
        int rotationCount = 8;
        rotateByNumber(intArray, rotationCount);
    }

    public static void rotateByNumber(int [] intArray, int rotationCount) {
        int n = intArray.length;
        for (int i=0; i<rotationCount; i++) {
            int firstElement = intArray[0];
            for (int j=0; j<n-1; j++) {
                intArray[j] = intArray[j+1];
            }
            intArray[n-1] = firstElement;
        }
        System.out.println("rotated array : "+ Arrays.toString(intArray));
    }
}
