package com.pushpa.corejava.miscellaneous;

import java.util.Arrays;
import java.util.List;

public class SampleTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

    }

    public void getValue(List<Integer> list) {
        // it doesn't allow other than integer values in the list due to generic type
        //list.add("some");
        list.add(10);
    }
}
