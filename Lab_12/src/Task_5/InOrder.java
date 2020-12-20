package Task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InOrder {
    public static StringBuilder getLine(String[] words) {

        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]);
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        while (wordsList.remove("")) {
            wordsList.remove("");
        }
        while (Check(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word : wordsList) {
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result;
    }

    public static boolean Check(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}