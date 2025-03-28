package com.pushpa.corejava.interview;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] initialArray = {1,2,3,4,5};
        int noOfRotations = 1;
        int arrayLength = initialArray.length;
        System.out.println("Array Values before Rotation :");
        printArray(initialArray);
        int lastElement = initialArray[arrayLength-1];
        for (int i=arrayLength-1; i>0; i--) {
            initialArray[i] = initialArray[i-1];
        }
        initialArray[0] = lastElement;
        System.out.println("Array Values after Rotation : ");
        printArray(initialArray);
    }
    public static void rotateArrayOnePosition(int [] arr, int k) {

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
