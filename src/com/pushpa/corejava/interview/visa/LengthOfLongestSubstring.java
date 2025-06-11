package com.pushpa.corejava.interview.visa;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";
        String input4 = "abcdefg";

        System.out.println("Input: " + input1 + " => Longest Unique Substring Length: " + lengthOfLongestSubstring(input1));
        System.out.println("Input: " + input2 + " => Longest Unique Substring Length: " + lengthOfLongestSubstring(input2));
        System.out.println("Input: " + input3 + " => Longest Unique Substring Length: " + lengthOfLongestSubstring(input3));
        System.out.println("Input: " + input4 + " => Longest Unique Substring Length: " + lengthOfLongestSubstring(input4));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLen = Math.max(maxLen, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLen;
    }
}
