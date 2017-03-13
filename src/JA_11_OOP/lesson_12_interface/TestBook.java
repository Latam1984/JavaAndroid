package JA_11_OOP.lesson_12_interface;

import java.util.Arrays;

/**
 * Created by Aleksey on 13.03.2017.
 */
public class TestBook {
    public static void main(String[] args) {
        Book [] books = new Book[4];
        books [0] = new Book("Head First Java", "AA", 2014);
        books [1] = new Book("Head First Java1", "Ai", 2015);
        books [2] = new Book("Head First Java2", "AP", 2011);
        books [3] = new Book("Head First Java3", "AN", 2019);
        Arrays.sort(books);
        Arrays.sort(books, 1,4);
        for (Book book: books) {
            System.out.println(book);
        }
    }
}
