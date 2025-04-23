package com.pushpa.corejava.interview.fidelity;

public class ReverseStringWithoutLibraryFunction {
    public static void main(String[] args) {
        String reverseStr = reverseString("pushpa is bad");
        System.out.println("reverseStr : "+reverseStr);
    }
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
}
