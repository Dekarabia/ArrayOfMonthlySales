package ru.Netology.javaqa.ArrayOfMonthlySales.services;

public class StatsService {

    public int theAmountOfSales(int[] sales) {
        //сумма всех продаж
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total;
    }

    public int averageSalesAmount(int[] sales) {
        //средняя сумма продаж в месяц
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total / sales.length;
    }

    public int minSales(long[] sales) {
        //минимум продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        // максимум продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int belowAverage(int[] sales) {
        //продажи ниже среднего
        int numberOfMonth = 0;
        int average = (int) averageSalesAmount (sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }

    public int aboveAverage(int[] sales) {
        //продажи выше среднего
        int numberOfMonth = 0;
        int average = (int) averageSalesAmount (sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}










