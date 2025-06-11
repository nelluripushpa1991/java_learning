package com.pushpa.corejava.interview.photon;

public class LongestBalancedSubstring {
    public static void main(String[] args) {
        System.out.println(longestBalancedSubstring("(()())"));
        System.out.println("second example : ");
        System.out.println(longestBalancedSubstring("())(()"));
    }

    public static int longestBalancedSubstring(String s) {
        int maxLen = 0, open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') open++;
            else close++;
            if (open == close) maxLen = Math.max(maxLen, 2 * close);
            else if (close > open) open = close = 0;
        }
        System.out.println("after forward rotation open : "+open+" close : "+close+" maxLen : "+maxLen);
        open = close = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') open++;
            else close++;
            if (open == close) maxLen = Math.max(maxLen, 2 * open);
            else if (open > close) open = close = 0;
        }
        System.out.println("after reverse rotation open : "+open+" close : "+close+" maxLen : "+maxLen);
        return maxLen;
    }
}
