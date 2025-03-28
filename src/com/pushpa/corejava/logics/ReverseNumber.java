package com.pushpa.corejava.logics;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123;
        reverseNumber(n);
    }

    public static void reverseNumber(int num) {
        int reverse = 0;
        int original = num;
        while (num > 0) {
            reverse = reverse*10 + num%10;
            num /= 10;
        }
        System.out.println("Original Number : "+original);
        System.out.println("Reverse Number : "+reverse);
    }
}
