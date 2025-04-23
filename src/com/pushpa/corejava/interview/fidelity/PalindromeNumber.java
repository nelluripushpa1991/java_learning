package com.pushpa.corejava.interview.fidelity;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome number or not : "+checkPalindrome(123));
    }

    public static boolean checkPalindrome(int number) {
        int reverse = 0, original = number;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse == original;
    }
}
