package JA_11_OOP.lesson_12_numbers;

/**
 * Created by Aleksey on 13.03.2017.
 */
public interface Addable<T> {
    T plus(T other);

    T minus(T other);
}
