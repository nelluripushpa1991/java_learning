package com.pushpa.corejava.miscellaneous;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string : ");
        String str2 = sc.nextLine();

        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (isAnagram(charArray1, charArray2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }

        if (isAnagramUsingMap(charArray1, charArray2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }

    }
    public static boolean isAnagram(char[] ch1, char[] ch2) {
        if (ch1.length != ch2.length) {
            return false;
        }
        for (int i=0; i<= ch1.length-1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramUsingMap(char[] char1, char[] char2) {
        Map<Character, Integer> map = new HashMap<>();
        if (char1.length != char2.length) {
            return false;
        }
        for (int i=0; i<= char1.length-1; i++) {
            if (map.containsKey(char1[i])) {
                map.put(char1[i], map.get(char1[i])+1);
            } else {
                map.put(char1[i], 1);
            }
        }
        for (int i=0; i<= char2.length-1; i++) {
            if (map.containsKey(char2[i])) {
                map.put(char2[i], map.get(char2[i])-1);
            } else {
                return false;
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key: keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
