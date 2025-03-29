package com.pushpa.corejava.logics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        if(isArmstrongNumber(153))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
    public static boolean isArmstrongNumber(int num) {
        int sum = 0, original = num, n = String.valueOf(num).length();
        while (num > 0) {
            int digit = num%10;
            sum += Math.pow(digit,n);
            num /= 10;
        }
        return original == sum ? true : false;
    }
}
