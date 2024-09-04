//package com.pushpa.corejava.loto;
//
//import java.util.*;
//
//public class LottoProgram1 {
//    public static void main(String args []) {
//        List<String> formatList = new ArrayList<>();
//        Map<String, Integer[]> finaTticketsMap = new HashMap<>();
//        Integer[] generatedTickets = new Integer[7];
//        formatList.add("AABBCDE");
//        //formatList.add("AAABCDE");
//
//        Map<String, Integer[]> numbersMap = new HashMap<>();
//        Integer[] valA = {2, 3, 4, 7, 8, 9, 1};
//        Integer[] valB = {12, 13, 14, 17, 18, 19, 11};
//        Integer[] valC = {22, 23, 24, 27, 28, 29, 21};
//        Integer[] valD = {32, 33, 34, 37, 38, 39, 31};
//        Integer[] valE = {42, 43, 44, 47, 48, 49, 41};
//
//        numbersMap.put("A", valA);
//        numbersMap.put("B", valB);
//        numbersMap.put("C", valC);
//        numbersMap.put("D", valD);
//        numbersMap.put("E", valE);
//
//        generatedTickets = formatLoop(formatList, numbersMap);
//        //System.out.println("******* ticketsList ******* "+ticketsMap.size());
//        //printTicketsList(ticketsList);
//        finaTticketsMap = compareTicketValues(numbersMap, generatedTickets);
//        System.out.println("finaTticketsMap ::: "+finaTticketsMap);
//    }
//
//    public static Integer[] formatLoop(List formatList, Map numbersMap) {
//        Map<String, Integer[]> ticketsMap = new HashMap<>();
//        Integer[] tickets = new Integer[7];
//        for (int format = 0; format < formatList.size(); format++) {
//            String[] formatArrayValues = (String[]) formatList.toArray(new String[0]);
//            for (int a = 0; a < formatArrayValues.length; a++) {
//                String formatValue = formatArrayValues[a].toString();
//                char[] ch = formatValue.toCharArray();
//                Integer[] finalNumbers = {0, 0, 0, 0, 0, 0, 0};
//                for (int b = 0; b < ch.length; b++) {
//                    if (formatValue.charAt(b) == 'A') {
//                        tickets = validate(finalNumbers,"A", numbersMap.get("A"));
//                    } else if (formatValue.charAt(b) == 'B') {
//                        tickets = validate(finalNumbers,"B", numbersMap.get("B"));
//                    } else if (formatValue.charAt(b) == 'C') {
//                        tickets = validate(finalNumbers,"C", numbersMap.get("C"));
//                    } else if (formatValue.charAt(b) == 'D') {
//                        tickets = validate(finalNumbers,"D", numbersMap.get("D"));
//                    } else {
//                        tickets = validate(finalNumbers,"E", numbersMap.get("E"));
//                    }
//                }
//            }
//        }
//        return tickets;
//    }
//
//    public static Integer[] validate(Integer[] finalNumbers, String category, Object predictedNos) {
//        int spotLoop = 0;
//        String loaded = "N";
//        String numberCheck = "N";
//        Integer [] predictedNumbers = (Integer[]) predictedNos;
//        while (loaded == "N") {
//            int index = 0;
//            String numberFound = "Y";
//            while (numberFound == "Y") {
//                numberFound = verifyNumber(predictedNumbers[index], finalNumbers);
//                if (numberFound == "Y") {
//                    index += 1;
//                }
//            }
//            String spotIdentified = "N";
//            int spot = 0;
//            int num = 0;
//            while(spotIdentified == "N") {
//                if (finalNumbers[num] == 0) {
//                    spot = num;
//                    spotIdentified = "Y";
//                } else {
//                    num+=1;
//                }
//            }
//            finalNumbers[spot] = predictedNumbers[index];
//            loaded = "Y";
//        }
//        //printValues(category, finalNumbers);
//        return finalNumbers;
//    }
//
//    public static String verifyNumber(int predict, Integer[] finalNumbers) {
//        String numberFound = "N";
//        List<Integer> targetList = Arrays.asList(finalNumbers);
//        if (targetList.contains(predict)) {
//            numberFound = "Y";
//        }
//        return numberFound;
//    }
//
//    public static void printValues(String category, Integer[] finalNumbers) {
//        for (int i = 0; i < finalNumbers.length; i++) {
//            if (finalNumbers[i] != 0) {
//                System.out.println("final numbers for "+category+" :::::: "+finalNumbers[i]);
//            }
//        }
//    }
//
////    public static void printTicketsList(List<Integer[]> ticketsList) {
////        for (int i = 0; i < ticketsList.size(); i++) {
////            Integer[] tickets = (Integer[])ticketsList.get(i);
////            System.out.println("final numbers for "+i+" :::::: "+tickets);
////        }
////    }
//
//    public static Map<String, Integer[]> compareTicketValues(Map<String, Integer[]> numbersMap, Integer[] generatedTickets) {
//        Map<String, Integer[]> finalLeftOverTicketsMap = new HashMap<>();
//        numbersMap.forEach((numberKey,numberValue) -> {
//            for (int number = 0; number < numberValue.length; number++) {
//                if (!(Arrays.stream(generatedTickets).toList().contains(numberValue[number]))) {
//                    Integer[] leftOverTickets = new Integer[numberValue.length];
//                    leftOverTickets[number] = numberValue[number];
//                    finalLeftOverTicketsMap.put(numberKey, leftOverTickets);
//                }
//            }
//        });
//        return finalLeftOverTicketsMap;
//    }
//
//}
