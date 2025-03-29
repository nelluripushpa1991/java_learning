package com.pushpa.corejava.logics;

public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arrayValues = {20,90,150,30,200,40,50,25};
        int max = arrayValues[0];
        for (int num:arrayValues) {
            if (num > max)
                max = num;
        }
        System.out.println("Max Number : "+max);
    }
}
