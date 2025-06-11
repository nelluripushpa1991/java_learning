package com.pushpa.corejava.interview.aa;

public class SpecialNumberPrinter {
    
//        Write a function that prints all Special Numbers from 10 to 9999.
//        A special number is a number whose each digit differs by at most 1
//        from each of its neighboring digits.Examples: 7887 is a Special Number & 312
//        is not a Special Number. Make sure to print each Special Number in a new line.

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
            System.out.println("*********** numStr.charAt(i - 1) : "+numStr.charAt(i - 1)+" numStr.charAt(i) : "+numStr.charAt(i));
            int prevDigit = numStr.charAt(i - 1) - '0';
            int currDigit = numStr.charAt(i) - '0';
            if (Math.abs(prevDigit - currDigit) > 1) {
                System.out.println("prevDigit : "+prevDigit+" currDigit : "+currDigit);
                return false;
            }
        }
        return true;
    }
}
