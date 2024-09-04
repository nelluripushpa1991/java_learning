package com.pushpa.corejava.scope;

public class WaysToBreakSingleton {
    public static void main(String[] args) {
        Singleton originalSingletonInstance = Singleton.getInstance();
        Singleton duplicateSingletonInstance = Singleton.getInstance();
        System.out.println(" originalSingletonInstance : "+originalSingletonInstance.hashCode());
        System.out.println(" duplicateSingletonInstance : "+duplicateSingletonInstance.hashCode());


    }

}
