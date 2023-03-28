public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");
        int year = 2021;
        printMessage(year);
        task2(1, 2011);
        //task3();
        printDeliveryDays(80);

    }
    public static boolean leapYear(int year){
        return (year % 400 == 0) || (year %4 == 0 && year % 100 != 0);
    }
    private static void printMessage(int year) {
        if (leapYear(year))
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");
    }
    private static void task2(int clientOS, int year) {
        System.out.println("Задача2");
        if (clientOS == 1) {
            if (year >= 2015) {
                System.out.println("Установите версию приложения для Андроид по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Не поддерживается");
            }
        } else {
            if (year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Не поддерживается");
            }
        }
    }
    private static void printDeliveryDays(int distance) {
        System.out.println("Задача3");
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays <= 0) {
        System.out.println("Свыше 100 км доставки нет.");
        } else {
        System.out.println("Потребуется дней: " + deliveryDays + " срок доставки.");
        }
    }
    private static int calculateDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        }else {
            return -1;
        }
    }
}