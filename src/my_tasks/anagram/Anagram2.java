package my_tasks.anagram;

import java.io.*;
import java.util.*;

/**
 * Created by Aleksey on 16.03.2017.
 * FindDifferentWordsMadeOfTheSameGroupOfLetters
 */

//Надо проанализировать и разобрать + оптимизировать

public class Anagram2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        PrintWriter writer = null;
        String str = null;
        Set<String> pattern = new TreeSet<String>();
        List<String> orderedList = new ArrayList<String>();
        int count = 0;

        try {
            reader = new BufferedReader(new FileReader("equalWords.txt"));
            writer = new PrintWriter(new BufferedWriter(new FileWriter("equalWordsOut.txt")));

            while ((str = reader.readLine()) != null) {
                orderedList.add(str);
                char[] letterArray = str.toCharArray();
                Arrays.sort(letterArray);
                String orderedCharacters = new String(letterArray);
                pattern.add(orderedCharacters);
            }

            for (String patternSetItem : pattern) {
                for (String orderedListItem : orderedList) {
                    char[] letterArr = orderedListItem.toCharArray();
                    Arrays.sort(letterArr);
                    String orChar = new String(letterArr);
                    if (patternSetItem.equals(orChar)) {
                        count++;
                        if (count >= 3) writer.print(orderedListItem + " ");
                    }
                }
                if (count >= 3) writer.println();
            }

        } finally {
            if (reader != null) {
                reader.close();
            }

            if (writer != null) {
                writer.close();
            }
        }
    }
}

