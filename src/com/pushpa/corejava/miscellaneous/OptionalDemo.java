package com.pushpa.corejava.miscellaneous;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        words[1] = "one";
        words[2] = "two";
        words[3] = "three";
        words[4] = "four";
        words[6] = "six";
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }
}
