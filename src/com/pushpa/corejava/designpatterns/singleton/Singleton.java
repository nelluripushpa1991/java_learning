package com.pushpa.corejava.designpatterns.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private static Singleton INSTANCE = null;
    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
