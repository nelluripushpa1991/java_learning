package com.interview;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class CSVFileParserExample {

    public static void main(String[] args) {
        getMaximumIntraDayStock();
    }

    public static void getMaximumIntraDayStock(){
        String path = "C:/Users/naren/Downloads/archive/all_stocks_5yr.csv";
        LocalDate cutoffDate = LocalDate.now().minusYears(1);
        String stockSymbol = null;
        double maxIntraDayChange = 0;

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                LocalDate date = LocalDate.parse(fields[0], DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                if(date.isBefore(cutoffDate)) continue;

                double high = Double.parseDouble(fields[2]);
                double low = Double.parseDouble(fields[3]);

                // stock name
                String tempStockSymbol = fields[6];

                double intraDayDifference = Math.abs(high - low);

                if(maxIntraDayChange > intraDayDifference){
                    stockSymbol = tempStockSymbol;
                    maxIntraDayChange = intraDayDifference;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("SYMBOL STOCK : "+ Optional.ofNullable(stockSymbol).orElse(""));
        System.out.println("SYMBOL STOCK : "+Optional.ofNullable(stockSymbol).orElse(""));

    }

}
