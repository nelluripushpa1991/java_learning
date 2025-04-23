package com.pushpa.corejava.interview.fidelity;

import java.util.Stack;

public class CheckBalancedParentheses {
    public static void main(String[] args) {
        System.out.println("Check balanced parentheses : "+isBalanced("([({})])"));
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '['))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
