package com.pushpa.corejava.miscellaneous;

public class UtilDemo {

    public String compare(StringCompare obj) {

        if (obj != null) {
            if ((obj.getFirst().length())+ (obj.getSecond().length()) > 10) {
                return null;
            }
        }
        return obj.getSecond();
    }

}
