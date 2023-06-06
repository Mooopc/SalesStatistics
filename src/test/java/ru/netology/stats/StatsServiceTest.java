package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void getAllSalesSum() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getAllSalesSum(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - сумма за все месяцы");
    }

    @Test
    public void getSalesSumPerMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getSalesSumPerMonth(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - среднемесячная сумма");
    }

    @Test
    public void getMaxSalesSumMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMaxSalesSumMonth(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - месяц с максимальными продажами");
    }

    @Test
    public void getMinSalesSumMonth() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.getMinSalesSumMonth(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - месяц с минимальными продажами");
    }

    @Test
    public void getMonthAmountBelowAvrgSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMonthAmountBelowAvrgSales(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - количество месяцев с продажами ниже среднего");
    }

    @Test
    public void getMonthAmountAboveAvrgSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMonthAmountAboveAvrgSales(sale);
        Assertions.assertEquals(expected, actual);
        System.out.println(actual + " - количество месяцев с продажами выше среднего");
    }
}

