package com.pushpa.corejava.logics;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World Java Programming";
        int vowelCount = 0, consonantsCount = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowelCount++;
                else
                    consonantsCount++;
            }
        }
        System.out.println("vowelCount : "+vowelCount+" consonantsCount : "+consonantsCount);
    }
}
