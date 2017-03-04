package ja_11_syntax.lesson_06_method_practice.Test;

/**
 * Created by Aleksey on 01.03.2017.
 * В заданной строке, после каждого слова вида «sin», «cos» или «log»,
 поставить скобку «(».
 */
public class Task5c {
    public static void main(String[] args) {
        String someString = "sin, sol, fall, cos, log, sol";
someString.replaceAll("sin", "sin)");
        System.out.println(someString.replaceAll("cos\\ )", "cos"));
    }
}
