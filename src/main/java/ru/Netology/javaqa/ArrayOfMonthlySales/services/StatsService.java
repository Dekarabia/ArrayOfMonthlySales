package ru.Netology.javaqa.ArrayOfMonthlySales.services;

public class StatsService {

    public long theAmountOfSales(long[] sales) {
        //сумма всех продаж
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[Math.toIntExact((long) i)];
        }
        return total;
    }

    public long averageSalesAmount(long[] sales) {
        //средняя сумма продаж в месяц
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[Math.toIntExact((long) i)];
        }
        return (total / sales.length);
    }

    public long minSales(long[] sales) {
        //минимум продаж
        long minMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact((long) i)] <= sales[Math.toIntExact((long) minMonth)]) {
                minMonth = i;
            }
        }
        return (minMonth + 1);
    }

    public long maxSales(long[] sales) {
        // максимум продаж
        long maxMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact((long) i)] >= sales[Math.toIntExact((long) maxMonth)]) {
                maxMonth = i;
            }
        }
        return (maxMonth + 1);
    }

    public long belowAverage(long[] sales) {
        //продажи ниже среднего
        long numberOfMonth = 0;
        long average = averageSalesAmount (sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact((long) i)] >= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }

    public long aboveAverage(long[] sales) {
        //продажи выше среднего
        long numberOfMonth = 0;
        long average = averageSalesAmount(sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact((long) i)] <= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return numberOfMonth;
    }
}










