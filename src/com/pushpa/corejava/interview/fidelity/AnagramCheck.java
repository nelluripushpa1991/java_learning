package com.pushpa.corejava.interview.fidelity;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println("Check Anagram : "+anagramCheck("heart", "earth"));
        System.out.println("Check Anagram : "+anagramCheck("health", "wealth"));
    }

    public static boolean anagramCheck(String str1, String str2) {
        if (str1.length()-1 != str2.length()-1) return false;
        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
