package lesson16_arraylist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aleksey on 20.03.2017.
 */
public class TaskListFiles {
    public static void main(String[] args) {
    File file = new File(".");//current dir
        System.out.println(file.getAbsolutePath());
        String [] stringArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        List<String> filesList = Arrays.asList(stringArray);
        for (String s : filesList) {
            System.out.println(s);
        }
    }
}
