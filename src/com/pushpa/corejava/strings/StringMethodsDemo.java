package com.pushpa.corejava.strings;

public class StringMethodsDemo {
    public static void main(String[] args) {
        // length method
        String s1="hello";
        String s2="whatsup";
        System.out.println("string length is: "+s1.length());
        System.out.println("string length is: "+s2.length());

        // compareTo method
        String s11="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s11)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        // concat method
        s1=s1.concat("how are you");
        System.out.println(s1);

        // isEmpty method
        String s111="";
        String s22="hello";
        System.out.println(s111.isEmpty());      // true
        System.out.println(s22.isEmpty());

        // trim method
        String s1111="  hello   ";
        System.out.println(s1111+"how are you");        // without trim()
        System.out.println(s1111.trim()+"how are you"); // with trim()

        // lower case method
        String s11111="HELLO HOW Are You?";
        String s1lower=s11111.toLowerCase();
        System.out.println(s1lower);

        // upper case method
        String s111111="hello how are you";
        String s1upper=s111111.toUpperCase();
        System.out.println(s1upper);

        // valueOf method
        int value=20;
        String s100=String.valueOf(value);
        System.out.println(s100+17);       //concatenating string with 10

        // replace method1
        String s101="hello how are you";
        String replaceString=s101.replace('h','t');
        System.out.println(replaceString);

        // replace method2
        String s102="Hey, welcome to Edureka";
        String replaceString1=s102.replace("Edureka","Brainforce");
        System.out.println(replaceString1);

        // contains method
        String name=" hello how are you doing";
        System.out.println(name.contains("how are you"));  // returns true
        System.out.println(name.contains("hello"));        // returns true
        System.out.println(name.contains("fine"));         // returns false

        // equalsIgnoreCase method
        String s103="hello";
        String s203="hello";
        String s303="hi";
        System.out.println(s103.equalsIgnoreCase(s203));   // returns true
        System.out.println(s103.equalsIgnoreCase(s303));   // returns false

        // toCharArray method
        String s104="Welcome to Edureka";
        char[] ch=s104.toCharArray();
        for(int i=0;i<ch.length;i++) {
            System.out.print(ch[i]);
        }

        // getBytes method
        String s105="ABC";
        byte[] b=s105.getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        //  isEmpty method
        String s106="";
        String s206="hello";
        System.out.println(s106.isEmpty());     // returns true
        System.out.println(s206.isEmpty());     // returns false

        // endsWith method
        String s107="hello how are you";
        System.out.println(s1.endsWith("u"));       // returns true
        System.out.println(s1.endsWith("you"));     // returns true
        System.out.println(s1.endsWith("how"));     // returns false

    }
}
