package com.pushpa.corejava.logics;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madamam";
        if (checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        // reverse string
        reverseStringWithoutUsingInbuiltFunction(str);
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
    public static void reverseStringWithoutUsingInbuiltFunction(String str) {
        String reverse = "";
        for (int s=str.length()-1; s>=0; s--) {
            reverse += str.charAt(s);
        }
        System.out.println("reverse str : "+reverse);
    }
}
