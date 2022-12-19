import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYears(int year) {
        int balance = year % 4;
        int oneHundred = year % 100;
        int fourHundred = year % 400;
        if (fourHundred == 0) {
            System.out.println(year + " год является високосным");
        } else if (oneHundred == 0) {
            System.out.println(year + " год не является високосным");
        } else if (balance == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkClientDevice(int operSystem, int clientDeviceYear) {
        if (operSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите текущую версию приложения для iOS по ссылке");
        } else if (operSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите текущую версию приложения для Android по ссылке");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        checkYears(year);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int operSystem = 1;
        int clientDeviceYear = 2014;
        checkClientDevice(operSystem, clientDeviceYear);
        System.out.println();
    }

    public static int countDaysDelivery(int deliveryDistance) {
        int days;
        if (deliveryDistance <= 20 && deliveryDistance > 1) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = 3;
        } else {
            days = 0;
        }
        return days;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 101;
        int deliveryDays = countDaysDelivery(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}