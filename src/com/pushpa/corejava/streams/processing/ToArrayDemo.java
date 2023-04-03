package com.pushpa.corejava.streams.processing;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        //Convert to object array
        Object[] array = list.toArray();
        //Iterate and convert to desired type
        for(Object o : array) {
            String s = (String) o;  //This casting is required
            System.out.println(s);
        }

        String[] array1 = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(array1));
    }
}
