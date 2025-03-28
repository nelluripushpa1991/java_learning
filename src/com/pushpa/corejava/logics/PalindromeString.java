package com.pushpa.corejava.logics;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        if (checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
