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
        List<Character> testList = new ArrayList<>();
        for (char c : charArr) {
            charList.add(c);
        }
        for (char w : wordArr) {
            wordList.add(w);
        }
        for (var i = 0; i < wordArr.length - 1; i++) {
            if (charList.contains(wordList.get(i))) {
                testList.add((char) i);
            }
        }
        return wordList.size() == testList.size();
    }
}

//END
