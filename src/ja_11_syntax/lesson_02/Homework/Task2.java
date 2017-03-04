package ja_11_syntax.lesson_02.Homework;

/**
 * Created by Aleksey on 24.02.2017.
 *
 * Задание 2;     Строку с ФИО разбить на три строки Ф, И, О.
 * Работа кода должна оставаться корректной при изменении исходной строки на другое ФИО.
 */
public class Task2 {
    public static void main(String[] args) {
        String input = "Ivanov Ivsn Ivanovich";

        String surname;
        String name;
        String patr;

        int spacePos1 = input.indexOf(" ");
        surname = input.substring(0, spacePos1);
        System.out.println("surname = " + surname);

        int spacePos2 = input.indexOf(" ", spacePos1 +1);
        name = input.substring(spacePos1 +1, spacePos2);
        patr = input.substring(spacePos2 +1);

        System.out.println("patr = " + patr);
    }
}
