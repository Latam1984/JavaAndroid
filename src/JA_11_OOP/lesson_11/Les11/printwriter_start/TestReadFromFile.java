package JA_11_OOP.lesson_11.Les11.printwriter_start;
import java.io.*;
public class TestReadFromFile {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        BufferedReader br =
                new BufferedReader(new FileReader(file));
        String line = null;
        /*while((line = br.readLine())!= null){
            System.out.println(line);
        }*/
        while (br.ready()){
            System.out.println(br.readLine());
        }
        br.close();

    }
}
