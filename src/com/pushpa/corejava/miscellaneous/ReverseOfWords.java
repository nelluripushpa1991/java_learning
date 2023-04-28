package com.pushpa.corejava.miscellaneous;

public class ReverseOfWords {
    public static void main(String[] args) {
        String stringOfWords = "'P','E','R','F','E','C','T',' ','M','A','K','E','S',' ','P','R','A','C','T','I','C','E'";
        System.out.println("stringOfWords : "+stringOfWords);
        String reversedString = reverseOfWord(stringOfWords);
        System.out.println("Required output : "+reversedString.trim());
    }
    public static String reverseOfWord(String stringOfWords) {
        String[] stringArray = stringOfWords.split(" ");
        StringBuilder reversedStringBuffer = new StringBuilder();
        for (int i= stringArray.length-1; i>=0; i--) {
            reversedStringBuffer.append(stringArray[i]).append(" ");
        }
        String reversedString = reversedStringBuffer.toString();
        System.out.println("reversedString : "+reversedString);
        reversedString = reversedString.replaceAll(",'","").replaceAll("'","");
        return reversedString.trim();
    }
}
