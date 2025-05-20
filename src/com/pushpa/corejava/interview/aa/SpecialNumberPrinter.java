package com.pushpa.corejava.interview.aa;

public class SpecialNumberPrinter {
    public static void main(String[] args) {
        for (int number = 10; number <= 9999; number++) {
            if (isSpecialNumber(number)) {
                System.out.println(number);
            }
        }
    }

    // Function to check if a number is a Special Number
    private static boolean isSpecialNumber(int number) {
        String numStr = Integer.toString(number);
        for (int i = 1; i < numStr.length(); i++) {
            int prevDigit = numStr.charAt(i - 1) - '0';
            int currDigit = numStr.charAt(i) - '0';
            if (Math.abs(prevDigit - currDigit) > 1) {
                return false;
            }
        }
        return true;
    }
}
