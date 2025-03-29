package com.pushpa.corejava.logics;

public class SwapNumber {
    public static void main(String[] args) {
        swapNumber(10,20);
        swapNumberWithoutThirdVar(100, 200);
    }
    public static void swapNumber(int a, int b) {
        System.out.println("Before Swap Numbers : a : "+a+" b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("***************************************");
        System.out.println("After Swap Numbers : a : "+a+" b: "+b);
    }
    public static void swapNumberWithoutThirdVar(int num1, int num2) {
        System.out.println("Before Swap Numbers : num1 : "+num1+" num2: "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("***************************************");
        System.out.println("After Swap Numbers : num1 : "+num1+" num2: "+num2);
    }
}
