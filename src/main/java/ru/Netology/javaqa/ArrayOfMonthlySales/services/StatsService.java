package ru.Netology.javaqa.ArrayOfMonthlySales.services;

public class StatsService {

    public long theAmountOfSales(long[] sales) {
        //сумма всех продаж
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }

    public long averageSalesAmount(long[] sales) {
        //средняя сумма продаж в месяц
        long average = theAmountOfSales(sales) / sales.length;
        return average;
    }

    public long minSales(long[] sales) {
        //минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        // максимум продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;

            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverage(long[] sales) {
        //продажи ниже среднего
        int numberOfMonth = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                numberOfMonth++;
            }

        }
        return numberOfMonth;
    }

    public int aboveAverage(long[] sales) {
        //продажи выше среднего
        int numberOfMonth = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }
}









