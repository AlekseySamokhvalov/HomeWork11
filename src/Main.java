
public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installApp(int osType, int deviceYear) {
        int currentYear = 2015;

        if (deviceYear >= currentYear) {
            System.out.println("Установите приложение для " + (osType == 0 ? "iOS" : "Android") + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + (osType == 0 ? "iOS" : "Android") + " по ссылке");
        }
    }

    public static int getDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; // возвращаем -1 для обозначения ошибки
        }
    }

    public static void main(String[] args) {
        System.out.println("Решение задачи 1");
        int year = 2023;
        checkLeapYear(year);

        System.out.println("Решение задачи 2");
        int osType = 1; // 0 — iOS, 1 — Android
        int deviceYear = 2017;
        installApp(osType, deviceYear);

        System.out.println("Решение задачи 3");
        int deliveryDistance = 95; // дистанция до клиента
        int deliveryDays = getDeliveryDays(deliveryDistance);

        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}