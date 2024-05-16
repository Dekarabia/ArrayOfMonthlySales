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

    public int minSales(long[] sales) {
        //минимум продаж
        int minMonth = 0;
<<<<<<< HEAD
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
=======
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] <= sales[Math.toIntExact(minMonth)]) {
                minMonth = i;
>>>>>>> 56937df6fb5966df2588f8b256a03e519f9e3ce9
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        // максимум продаж
        int maxMonth = 0;
<<<<<<< HEAD
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;

=======
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] >= sales[Math.toIntExact(maxMonth)]) {
                maxMonth = i;
>>>>>>> 56937df6fb5966df2588f8b256a03e519f9e3ce9
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverage(long[] sales) {
        //продажи ниже среднего
        int numberOfMonth = 0;
<<<<<<< HEAD
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                numberOfMonth++;
=======
        int average = (int) averageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] >= average) {
                numberOfMonth = numberOfMonth + 1;
>>>>>>> 56937df6fb5966df2588f8b256a03e519f9e3ce9
            }

        }
        return numberOfMonth;
    }

    public int aboveAverage(long[] sales) {
        //продажи выше среднего
        int numberOfMonth = 0;
<<<<<<< HEAD
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                numberOfMonth++;
=======
        int average = (int) averageSalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] <= average) {
                numberOfMonth = numberOfMonth + 1;
>>>>>>> 56937df6fb5966df2588f8b256a03e519f9e3ce9
            }
        }
        return numberOfMonth;
    }
}









