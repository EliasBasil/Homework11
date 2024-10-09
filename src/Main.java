import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int year = 2000;
        isLeapYear(year);

        // Задача 2
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        chooseOS(clientOS, currentYear);

        // Задача 3
        int distance = 95;
        int days = getDaysToDelivery(distance);
        if (days >= 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("На такую дистанцию доставки нет");
        }
    }

    public static void isLeapYear(int year) {
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && year > 1584) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void chooseOS(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int getDaysToDelivery (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}