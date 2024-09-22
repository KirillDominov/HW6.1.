public class Main {

    public static void printYear(int number) {
        if ((number % 400 == 0) || (number % 4 == 0)) {
            System.out.println(number + " год - високосный год");
        } else if (number % 100 == 0) {
            System.out.println(number + " год - невисокосный год");
        } else System.out.println(number + " год не является високосным");
    }

    public static void checkerDevice(int deviceOS, int deviceYear) {
        if ((deviceOS == 0) && (deviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((deviceOS == 1) && (deviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceYear >= 2015) {
            System.out.println("Установите приложение");
        }
    }

    public static void checkerDistance(int distance, int day) {
        if (distance < 20) {
            System.out.println("Потребуется дней " + day);
        } else if ((distance > 20) && (distance < 60)) {
            System.out.println("Потребуется дней " + (day + 1));
        } else if ((distance > 60) && (distance < 100)) {
            System.out.println("Потребуется дней " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание № 1");
        int year = 2024;
        printYear(year);
        System.out.println();
        System.out.println("Задание № 2");
        byte clientDeviceOS = 1;
        int clientDeviceYear = 2013;
        checkerDevice(clientDeviceOS, clientDeviceYear);
        System.out.println();
        System.out.println("Задание № 3");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        checkerDistance(deliveryDistance, deliveryDay);


    }
}

