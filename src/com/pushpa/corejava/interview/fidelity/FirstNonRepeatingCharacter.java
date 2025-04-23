package com.pushpa.corejava.interview.fidelity;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char nonRepeativeChar = firstNonRepeatingChar("pushpanelluri");
        System.out.println("nonRepeativeChar : "+nonRepeativeChar);
    }

    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char c : str.toCharArray())
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return '_'; // If no unique character
    }
}
