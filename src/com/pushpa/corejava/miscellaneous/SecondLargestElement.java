package com.pushpa.corejava.miscellaneous;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestElement {

    //Write a Java program to find the second-largest element in an array.
    // The program should take an integer array as input and output the second-largest
    // element in the array. Ensure that the solution handles edge cases such as arrays
    // with duplicate values and small array sizes.
    public static void main(String args []) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(12,44,76,1,8,9,9));
        int secondLarge = secondLargestElement(integerArrayList, 2);
        System.out.println(secondLarge);

    }
    public  static int secondLargestElement(ArrayList<Integer> integerArrayList, int n) {
        int nthLargestElement = integerArrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(n-1);

        return nthLargestElement;

    }
}
