public class Main {
    public static void main(String[] args) {
        // "Условный оператор.Ч 2."
        // "Задание 1"

        int clientOS1 = 1; //Что бы правильно предложить для использования нашего продукта просим вас ответить
        // на несколько вопросов: какое у Вас установленно системное ПО,нажмите "0" если iOS, или "1" если Android.
        if (clientOS1 == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android  по ссылке");

        // "Задание 2"

        int clientOS = 0; //Что бы правильно предложить для использования нашего продукта просим вас ответить
        // на несколько вопросов: какое у Вас установленно системное ПО,нажмите "0" если iOS, или "1" если Android.
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        } else System.out.println("Установите облегченную версию приложения для Android по ссылке");

    }
}
