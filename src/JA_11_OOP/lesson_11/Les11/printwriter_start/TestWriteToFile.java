package JA_11_OOP.lesson_11.Les11.printwriter_start;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestWriteToFile {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello!");
        for (int i = 0; i < 100; i++) {
            pw.println(i);
        }
        pw.close();

    }
}
