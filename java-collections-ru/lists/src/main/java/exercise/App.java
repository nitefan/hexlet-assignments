package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String chars, String word) {
        String wordToLow = word.toLowerCase();
        String charsToLow = chars.toLowerCase();
        char[] charArr = charsToLow.toCharArray();
        char[] wordArr = wordToLow.toCharArray();
        List<Character> charList = new ArrayList<>();
        List<Character> wordList = new ArrayList<>();
        for (char c : charArr) {
            charList.add(c);
        }
        for (char w : wordArr) {
            wordList.add(w);
        }
        int charCounter = 0;
        for (var i = 0; i < wordArr.length - 1; i++) {
            if (wordList.contains(charList.get(i))) {
                charList.remove(i);
                charCounter = charCounter + 1;
            }
        }
        return charCounter == wordArr.length;
    }
}

//END
