package com.pushpa.corejava.miscellaneous;

class A {
    public void methodA() {
        System.out.println("methodA");
    }
}
class B extends A {
    public void methodA() {
        //private void methodA() { // we can't reduce the access modifier in subclass
        System.out.println("methodB");
    }
}
public class Bitset {
    public static void main(String[] args) {
    A a = new B();
    a.methodA();
    }
}
