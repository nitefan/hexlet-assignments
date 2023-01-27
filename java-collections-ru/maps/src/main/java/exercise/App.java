package exercise;

import java.util.HashMap;
import java.util.Map;

import static java.util.HashMap.*;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.length() == 0) {
            return wordsCount;
        }
        String[] words = sentence.split(" ");
        for (String item : words) {
            if (wordsCount.containsKey(item)) {
                wordsCount.put(item, wordsCount.get(item) + 1);
            } else {
                wordsCount.put(item, 1);
            }
        }
        return wordsCount;
    }
    public static String toString(Map wordsCount) {
        if (wordsCount.size() == 0) {
            return "{}";
        }
        String result = "{\n";
        for (Map.Entry<String, Integer> wordsToDisplay : wordsCount.entrySet()) {
            result = result + " " + wordsToDisplay.getKey() + ":" + wordsToDisplay.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
