package ru.Netology.javaqa.ArrayOfMonthlySales.services;

public class StatsService {

    public long theAmountOfSales(long[] sales) {
        //сумма всех продаж
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[Math.toIntExact(i)];
        }
        return total;
    }

    public long averageSalesAmount(long[] sales) {
        //средняя сумма продаж в месяц
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[Math.toIntExact(i)];
        }
        return (total / sales.length);
    }

    public long minSales(long[] sales) {
        //минимум продаж
        int minMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] <= sales[Math.toIntExact(minMonth)]) {
                minMonth = (int) i;
            }
        }
        return (minMonth + 1);
    }

    public long maxSales(long[] sales) {
        // максимум продаж
        int maxMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] >= sales[Math.toIntExact(maxMonth)]) {
                maxMonth = (int) i;
            }
        }
        return (maxMonth + 1);
    }

    public long belowAverage(long[] sales) {
        //продажи ниже среднего
        int numberOfMonth = 0;
        long average = averageSalesAmount(sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] >= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }

    public long aboveAverage(long[] sales) {
        //продажи выше среднего
        int numberOfMonth = 0;
        long average = averageSalesAmount(sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] <= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}










