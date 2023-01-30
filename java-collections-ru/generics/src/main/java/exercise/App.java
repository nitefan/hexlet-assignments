package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> booksList,
                                                      Map<String, String> keyList) {
        List<Map<String, String>> booksFound = new ArrayList<>();
        for (Map book : booksList) {
            if (book.entrySet().containsAll(keyList.entrySet())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
//END
