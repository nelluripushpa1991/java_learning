package com.pushpa.interview.coding;

import java.io.IOException;

public class Sample {
    public static void main(String[] args) {
        try {
            int data = 100/0;
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("came1");
        } catch (ArithmeticException a) {
            System.out.println("came2");
        } catch (Exception e) {
            System.out.println("came3");
        }


    }
}
