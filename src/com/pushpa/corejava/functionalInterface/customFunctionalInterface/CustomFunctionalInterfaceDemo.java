package com.pushpa.corejava.functionalInterface.customFunctionalInterface;

@FunctionalInterface
public interface CustomFunctionalInterfaceDemo {
    void display();

    // functional interface should not allow the more than one abstract method
    //void display1();

    // functional interface should allow any no of default method
    default void show() {
        System.out.println("Welcome to default method in custom functional interface");
    }

    default void show1() {
        System.out.println("Welcome to default method in custom functional interface");
    }

    // functional interface should allow any no of static method
    static void print() {
        System.out.println("Welcome to static method in custom functional interface");
    }
    static void print1() {
        System.out.println("Welcome to static method in custom functional interface");
    }
}
