public class Main {

    public static void printYear(int number) {
        if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            System.out.println(number + " год - високосный год");
        } else {
            System.out.println(number + " год -  невисокосный год");
        }
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

    public static void calculateDeliveryDays(int distance, int day) {
        boolean oneDay = distance < 20;
        boolean twoDay = distance >= 20 && distance < 60;
        boolean threeDay = distance < 100 && distance >= 60;

        if (oneDay) {
            day = 1;
        } else if (twoDay) {
            day = 2;
        } else if (threeDay) {
            day = 3;
        }

        if (oneDay) {
            System.out.println("Потребуется дней: " + day);
        } else if (twoDay) {
            System.out.println("Потребуется дней: " + day);
        } else if (threeDay) {
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание № 1");
        int year = 1900;
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
        calculateDeliveryDays(deliveryDistance, deliveryDay);
    }
}

