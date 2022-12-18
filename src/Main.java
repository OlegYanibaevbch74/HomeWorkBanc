public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор.Ч 2.");
        System.out.println("Задание 1");

        int clientOS1 = 1; //Что бы правильно предложить для использования нашего продукта просим вас ответить
        // на несколько вопросов: какое у Вас установленно системное ПО,нажмите "0" если iOS, или "1" если Android.
        if (clientOS1 == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android  по ссылке");

        System.out.println("Задание 2");
        int clientOS = 0; //Что бы правильно предложить для использования нашего продукта просим вас ответить
        // на несколько вопросов: какое у Вас установленно системное ПО,нажмите "0" если iOS, или "1" если Android.
        int clientDeviceYear = 2008; // Укажите пожалуйста гот выпуска вашего телефона (т.е. ПО)
        if (clientOS == 0 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOS == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android  по ссылке");
        else if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        System.out.println("Задание 3");
        int year = 2224;     //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        if (year % 4 == 0) System.out.println( + year + " год является високосным.");
        else if (year % 100 == 0 && year % 400 != 0) System.out.println( + year + " год является високосным.");
        else System.out.println(+year+" год не является високосным.");

        System.out.println("Задание 4");

        int deliveryDistance = 160;
        int deliveryDistanceOneDey = 20;
        int deliveryDistanceNextDays = 40;
        int deliveryTime = (deliveryDistance-deliveryDistanceOneDey)/deliveryDistanceNextDays+1;
        System.out.println("Потребуется дней: " + deliveryTime);


    }
}
