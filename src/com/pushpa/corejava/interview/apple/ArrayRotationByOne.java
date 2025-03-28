package com.pushpa.corejava.interview.apple;

import java.util.Arrays;

public class ArrayRotationByOne {
    public static void main(String[] args) {
        int intArray [] = {1,2,3,4,5};
        rotateByOne(intArray);

    }

    public static void rotateByOne(int [] intArray) {
        int lastElement = intArray[intArray.length-1];
        for (int i=intArray.length-1; i > 0; i--) {
            intArray[i] = intArray[i-1];
        }
        intArray[0] = lastElement;
        System.out.println("**********************"+ Arrays.toString(intArray));
    }
}
