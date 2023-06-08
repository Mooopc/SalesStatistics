package ru.netology.stats;


public class StatsService {
    public int getAllSalesSum(int[] sales) { //сумма всех продаж;
        int salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum += sales[i];
        }
        return salesSum;
    }

    public int getSalesSumPerMonth(int[] sales) { //средняя сумма продаж в месяц;
        int salesSum = getAllSalesSum(sales);
        int avrgSalesSumPerMonth = salesSum / sales.length;
        return avrgSalesSumPerMonth;
    }

    public int getMaxSalesSumMonth(int[] sales) { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        int maxSalesSumMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesSumMonthNumber]) {
                maxSalesSumMonthNumber = i;
            }
        }
        return maxSalesSumMonthNumber + 1;
    }

    public int getMinSalesSumMonth(int[] sales) { //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        int minSalesSumMonthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesSumMonthNumber]) {
                minSalesSumMonthNumber = i;
            }
        }
        return minSalesSumMonthNumber + 1;
    }

    public int getMonthAmountBelowAvrgSales(int[] sales) { //количество месяцев, в которых продажи были ниже среднего (см. п.2);
        int monthAmountBelowAvrgSales = 0;
        int avrgSales = getSalesSumPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avrgSales) {
                monthAmountBelowAvrgSales += 1;
            }
        }
        return monthAmountBelowAvrgSales;
    }

    public int getMonthAmountAboveAvrgSales(int[] sales) { //количество месяцев, в которых продажи были ниже среднего (см. п.2);
        int monthAmountAboveAvrgSales = 0;
        int avrgSales = getSalesSumPerMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avrgSales) {
                monthAmountAboveAvrgSales += 1;
            }
        }
        return monthAmountAboveAvrgSales;
    }
}

//Программисты все заняты, и вам поручили написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:
//
//сумму всех продаж;
//среднюю сумму продаж в месяц;
//номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
//количество месяцев, в которых продажи были ниже среднего (см. п.2);
//количество месяцев, в которых продажи были выше среднего (см. п.2).
//Примечание: в вашем задании нужно найти последний месяц, соответствующий условиям.
//
//Сервис должен представлять собой один класс с шестью методами — по методу на пункт.
// Входные данные для расчёта сервис должен принимать в параметрах своих методов.
// Обратите внимание, что написанный класс должен уметь работать с любыми корректными значениями в массиве продаж,
// а приведённый выше набор — это лишь пример данных для ваших тестов на методы создаваемого класса.
