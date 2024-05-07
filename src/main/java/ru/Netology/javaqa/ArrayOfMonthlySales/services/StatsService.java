package ru.Netology.javaqa.ArrayOfMonthlySales.services;

public class StatsService {

    public int theAmountOfSales(long[] sales) {
        //сумма всех продаж
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[(int) i];
        }
        return (int) total;
    }

    public int averageSalesAmount(long[] sales) {
        //средняя сумма продаж в месяц
        long total = 0;
        for (long i = 0; i < sales.length; i++) {
            total += sales[(int) i];
        }
        return (int) (total / sales.length);
    }

    public int minSales(long[] sales) {
        //минимум продаж
        long minMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return (int) (minMonth + 1);
    }

    public int maxSales(long[] sales) {
        // максимум продаж
        long maxMonth = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return (int) (maxMonth + 1);
    }

    public int belowAverage(long[] sales) {
        //продажи ниже среднего
        long numberOfMonth = 0;
        long average = (int) averageSalesAmount(sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] >= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return (int) numberOfMonth;
    }

    public int aboveAverage(long[] sales) {
        //продажи выше среднего
        long numberOfMonth = 0;
        long average = (int) averageSalesAmount(sales);
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] <= average) {
                numberOfMonth = numberOfMonth + 1;
            }
        }
        return (int) numberOfMonth;
    }
}










