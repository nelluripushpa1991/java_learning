package com.pushpa.corejava.interview.apple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRotationByAnyNumber {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5};
        int rotationCount = 8;
        rotateByNumber(intArray, rotationCount);
        int [] intArray1 = {1,2,3,4,5,6};
        rotateNumOptimizedWay(intArray1,rotationCount);
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
    public static void rotateNumOptimizedWay(int [] intArray, int rotationCount) {
        // another way using collections.rotate method
        List<Integer> list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        Collections.rotate(list,rotationCount-1);
        System.out.println("More optimized way Rotated Array: " + list);
    }
}
