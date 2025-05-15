package com.pushpa.corejava.interview.aa;

public class SelfDividingNumberChecker {
    public static void main(String[] args) {
        int[] testNumbers = {128, 102, 127, 7, 24, 17, 172, -128, 0};
        for (int num : testNumbers) {
            System.out.println("Is number is self dividing number : "+checkSelfDividingNumber(num));
        }

    }

    public static boolean checkSelfDividingNumber(int num) {
        int original = num;
        if (num > 0) {
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || original % digit != 0) {
                    return false;
                }
                num /= 10;
            }
            return true;
        } else {
            return false;
        }
    }
}
