package com.pushpa.corejava.strings;

import java.util.ArrayList;

public class ImmutableDemo {
    public static void main(String[] args) {
        ArrayList<String> tokens = new ArrayList<>();
        tokens.add("active");
        tokens.add("new token");

        Record record = new Record(1, "value", tokens);
        System.out.println(record);   //Record{id=1, name='value', tokens=[active, new token]}

        record.getTokens().add("new token1");
        System.out.println(record);   //Record{id=1, name='value', tokens=[active, new token]}
    }
}
