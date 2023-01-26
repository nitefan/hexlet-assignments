package exercise;
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
        for (char w : wordArr) {
            wordList.add(w);
        }
        for (char c : charArr) {
            if (wordList.contains(c)){
                charList.add(c);
            }
        }
        for (char r : wordList) {
            if (charList.contains(r)) {
                charList.remove(r);
            }
        }
        return charList.isEmpty();
    }
}

//END
