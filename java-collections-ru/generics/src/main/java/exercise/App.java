package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(Map<String, String> booksList, Map keyList) {
        List<Map<String, String>> booksFound = new ArrayList<>();
        for (Map book : booksList) {
            boolean isFound;
            for (Object key : keyList.keySet()) {
                if (!booksList.containsValue(keyList.get(key))) {
                    isFound = false;
                }
            }
            if (isFound) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
//END
