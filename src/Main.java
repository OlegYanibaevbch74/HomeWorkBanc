public class Main {
    public static void main(String[] args) {
        System.out.println("Условный оператор.Ч 2.");
        System.out.println("Задание 1");

        int clientOS1 = 1; //Что бы правильно предложить для использования нашего продукта просим вас ответить
        // на несколько вопросов: какое у Вас установленно системное ПО,нажмите "0" если iOS, или "1" если Android.
        if (clientOS1 == 0) {
            System.out.println("установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android  по ссылке");
    }
}