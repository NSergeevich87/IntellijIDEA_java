import java.io.IOException;
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

        NewMessage("Введите дробное число: ");

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
}
