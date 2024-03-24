package com.pushpa.corejava.loto;

import java.util.*;

public class Program {
    public static void main(String args []) {
        List<String> numbersList = new ArrayList<>();
        numbersList.add("1,2,3,4,5,6,7,8,9,10");
        numbersList.add("11,12,13,14,15,16,17,18,19,20");
        numbersList.add("21,22,23,24,25,26,27,28,29,30");
        numbersList.add("31,32,33,34,35,36,37,38,39,40");
        numbersList.add("41,42,43,44,45,46,47,48,49,50");

        List<String> formatList = new ArrayList<>();
        formatList.add("AAABBCD");
        //formatList.add("ABABCDE");
        formatLoop(numbersList, formatList);
    }

    public static void formatLoop(List numbersList, List formatList) {
        Integer[] finalNumbers = {0, 0, 0, 0, 0, 0, 0};
        Integer[] predictedNumbers = {2, 3, 4, 7, 8, 9, 1};
        //String[] formatsArray = (String[]) formatList.toArray(new String[0]);
        for (int format = 0; format < formatList.size(); format++) {
            //String formatArrayValues = ((String) formatList.get(format));
            char [] formatArrayValues = ((String) formatList.get(format)).toCharArray();
            for (int a = 0; a < formatArrayValues.length; a++) {
                char formatChar = formatArrayValues[a];
                String formatValue = String.valueOf(formatChar);
                if (formatValue.contains("A")) {
                    CallA(finalNumbers, predictedNumbers);
                } else if (formatValue.contains("B")) {
                    CallA(finalNumbers, predictedNumbers);
                } else if (formatValue.contains("C")) {
                    //CallA(finalNumbers, predictedNumbers);
                } else if (formatValue.contains("D")) {
                    //CallA(finalNumbers, predictedNumbers);
                } else {
                    //CallA(finalNumbers, predictedNumbers);
                }
            }
        }
    }

    public static void CallA(Integer[] finalNumbers,Integer[] predictedNumbers) {
        int spotLoop = 0;
        String loaded = "N";
        String numberCheck = "N";
        while (loaded == "N") {
            int index = 0;
            String numberFound = "Y";
            while (numberFound == "Y") {
                numberFound = verifyNumber(predictedNumbers[index], finalNumbers);
                if (numberFound == "Y") {
                    index += 1;
                }
            }
            String spotIdentified = "N";
            int spot = 0;
            int num = 0;
            while(spotIdentified == "N") {
                if (finalNumbers[num] == 0) {
                    spot = num;
                    spotIdentified = "Y";
                } else {
                      num+=1;
                }
            }
            finalNumbers[spot] = predictedNumbers[index];
            loaded = "Y";
        }
        for (int i = 0; i < finalNumbers.length; i++) {
            System.out.println("final numbers i :::::: "+finalNumbers[i]);
        }
    }

    public static String verifyNumber(int predict, Integer[] finalNumbers) {
        String numberFound = "N";
        List<Integer> targetList = Arrays.asList(finalNumbers);
        if (targetList.contains(predict)) {
            numberFound = "Y";
        }
        return numberFound;
    }
}
