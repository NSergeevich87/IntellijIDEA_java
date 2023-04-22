import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Deberes_2 {

    public static void main(String[] args) {
        /*
        1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

        2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

        3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

        4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */
        //для первого задания
        NewMessage("Введите дробное число: ");

        //для проверки второго задания - делим элемент массива на 0
        System.out.println();
        System.out.println("Проверка второго задания: ");
        double number = newNum(0);
        System.out.println(number);

        //для проверки четвертого задания (считается, что при использовании "пробела" строка не пустая!)
        EmptyMessage("Напишите что-нибудь сюда или введите пустую строку если хотите Exception: ");

    }

    // Метод по задаче номер 1:
    public static void NewMessage(String message) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(message);
            try {
                float number = in.nextFloat();
                System.out.println("Вы ввели число: " + number);
                break;
            } catch (Exception e) {
                System.out.println("Введите дробное число цифрами и через запятую!");
            }
        }
    }


    // Задача номер 2:
    public static double newNum(int num) {
        double[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};   //объявил массив
        double catchedRes1 = 0;                               //объявил переменную
        int d = num;                                          //запросил число на которое будем делить элемент в массиве
        if (d == 0) {
            System.out.println("Вы делите элемент массива на 0");  //для деления на 0, можно обойтись конфигурацией if-else
        } else catchedRes1 = intArray[8] / d;
        return catchedRes1;
    }
    // Задача номер 3:

    public static void EmptyMessage(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string.isEmpty()) {
            try {
                throw new IOException("Пустые строки вводить нельзя!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println(string);
        }
    }
}