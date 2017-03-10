package JA_11_OOP.lesson_11.TestPrintWriter;

import java.io.*;

/**
 * Created by Aleksey on 10.03.2017.
 */
public class TestReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abd.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
//       while ((line = br.readLine())!=null){
//           System.out.println(line);
//       }
//       br.close();
       while (br.ready()){
           System.out.println(br.readLine());
       }
       br.close();
    }
}
