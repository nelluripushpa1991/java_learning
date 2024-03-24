package com.pushpa.corejava.loto;

import java.util.*;

public class LottoProgram {
    public static void main(String args []) {
        List<String> formatList = new ArrayList<>();
        formatList.add("AABBCDE");
        formatList.add("AAABCDE");

        Map<String, Integer[]> numbersMap = new HashMap<>();
        Integer[] valA = {2, 3, 4, 7, 8, 9, 1};
        Integer[] valB = {12, 13, 14, 17, 18, 19, 11};
        Integer[] valC = {22, 23, 24, 27, 28, 29, 21};
        Integer[] valD = {32, 33, 34, 37, 38, 39, 31};
        Integer[] valE = {42, 43, 44, 47, 48, 49, 41};

        numbersMap.put("A", valA);
        numbersMap.put("B", valB);
        numbersMap.put("C", valC);
        numbersMap.put("D", valD);
        numbersMap.put("E", valE);

        formatLoop(formatList, numbersMap);
    }

    public static void formatLoop(List formatList, Map numbersMap) {
        List ticketsList = new ArrayList<>();
        for (int format = 0; format < formatList.size(); format++) {
            String[] formatArrayValues = (String[]) formatList.toArray(new String[0]);
            //System.out.println(":::::: formatArrayValues ::: "+formatArrayValues.toString());
            for (int a = 0; a < formatArrayValues.length; a++) {
                String formatValue = formatArrayValues[a].toString();
                System.out.println(":::::: formatValue ::: "+formatValue);
                char[] ch = formatValue.toCharArray();
                System.out.println("length :   "+ch.length);
                Integer[] finalNumbers = {0, 0, 0, 0, 0, 0, 0};
                for (int b = 0; b < ch.length; b++) {
                    if (formatValue.charAt(b) == 'A') {
                        validate(finalNumbers,"A", numbersMap.get("A"));
                    } else if (formatValue.charAt(b) == 'B') {
                        validate(finalNumbers,"B", numbersMap.get("B"));
                    } else if (formatValue.charAt(b) == 'C') {
                        validate(finalNumbers,"C", numbersMap.get("C"));
                    } else if (formatValue.charAt(b) == 'D') {
                        validate(finalNumbers, "D", numbersMap.get("D"));
                    } else {
                        validate(finalNumbers, "E", numbersMap.get("E"));
                    }
                }

            }
        }
    }

    public static void validate(Integer[] finalNumbers, String category, Object predictedNos) {
        int spotLoop = 0;
        String loaded = "N";
        String numberCheck = "N";
        Integer [] predictedNumbers = (Integer[]) predictedNos;
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
        printValues("", finalNumbers);
    }

    public static String verifyNumber(int predict, Integer[] finalNumbers) {
        String numberFound = "N";
        List<Integer> targetList = Arrays.asList(finalNumbers);
        if (targetList.contains(predict)) {
            numberFound = "Y";
        }
        return numberFound;
    }

    public static void printValues(String category, Integer[] finalNumbers) {
        for (int i = 0; i < finalNumbers.length; i++) {
            System.out.println("final numbers for "+category+" :::::: "+finalNumbers[i]);
        }
    }
}
