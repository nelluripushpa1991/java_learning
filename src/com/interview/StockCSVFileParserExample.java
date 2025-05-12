package com.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StockCSVFileParserExample {
    public static void main(String[] args) {
        String path = "C:/Users/naren/Downloads/archive/all_stocks_5yr.csv";
        List<Stock> stockList = parseCSV(path);
        System.out.println("stockList size : "+stockList.size());
        getMaximumIntraDayStockDetails(stockList);

    }

    public static List<Stock> parseCSV(String filePath) {
        List<Stock> stocks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                LocalDate date = LocalDate.parse(tokens[0], DateTimeFormatter.ISO_DATE);
                double open = tokens[1] != null && !tokens[1].isEmpty() ? Double.parseDouble(tokens[1]) : 0.0;
                double high = tokens[2] != null && !tokens[2].isEmpty() ? Double.parseDouble(tokens[2]) : 0.0;
                double low = tokens[3] != null && !tokens[3].isEmpty() ? Double.parseDouble(tokens[3]) : 0.0;
                double close = tokens[4] != null && !tokens[4].isEmpty() ? Double.parseDouble(tokens[4]) : 0.0;
                long volume = tokens[5] != null && tokens[5].isEmpty() ? Long.parseLong(tokens[5]) : 0;
                String name = tokens[6];
                stocks.add(new Stock(date, open, high, low, close, volume, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stocks;
    }

    public static void getMaximumIntraDayStockDetails(List<Stock> stockList) {
        LocalDate cutoffDate = LocalDate.now().minusYears(1);
        String stockSymbol = null;
        double maxIntraDayChange = 0;

        for (Stock stock : stockList) {
            LocalDate date = stock.getDate();

            if(date.isBefore(cutoffDate)) {

                double high = stock.getHigh();
                double low = stock.getLow();

                // stock name
                String tempStockSymbol = stock.getName();

                double intraDayDifference = Math.abs(high - low);

                if (maxIntraDayChange > intraDayDifference) {
                    stockSymbol = tempStockSymbol;
                    maxIntraDayChange = intraDayDifference;
                }
            }
        }
        System.out.println("SYMBOL STOCK : "+ Optional.ofNullable(stockSymbol).orElse(""));
        System.out.println("maxIntraDayChange STOCK : "+maxIntraDayChange);
    }
}
