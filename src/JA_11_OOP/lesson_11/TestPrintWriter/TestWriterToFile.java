package JA_11_OOP.lesson_11.TestPrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Aleksey on 10.03.2017.
 */
public class TestWriterToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("abc.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello!w");
        for (int i = 0; i < 10; i++) {
            pw.print(i);
        }
        pw.close();
    }
}
