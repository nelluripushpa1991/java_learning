package com.test;

public class Test {
    public static void main(String[] args) {

//        Write a function that prints all Special Numbers from 10 to 9999.
//        A special number is a number whose each digit differs by at most 1
//        from each of its neighboring digits.Examples: 7887 is a Special Number & 312
//        is not a Special Number. Make sure to print each Special Number in a new line.

        printSpecialNumber();
    }

    public static void printSpecialNumber() {
        int [] intArray = new int[9999];
        for (int num = 10; num <= 9999; num++) {
        //int num = 7887;
        int originalNumber = num;
        int val = num;
            int count = 0;
            while (val > 1) {
                int digit = val % 10;
                int nextDigit = val % 100;
                if ((nextDigit)-digit <= 1) {
                    count++;
                }
                val /= 10;
            }
            if (count > 1)
            System.out.println("Special Numbers : "+originalNumber);
        }
    }
}
