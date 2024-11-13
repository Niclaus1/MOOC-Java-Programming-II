import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> meanings;

    public DictionaryOfManyTranslations() {
        this.meanings = new HashMap<>();
    }

    public void add(String word, String wordMeanings) {
        this.meanings.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> meaning = this.meanings.get(word);
        meaning.add(wordMeanings);

    }

    public ArrayList<String> translate(String word) {
        if (meanings.get(word) == null) {
            return new ArrayList<String>();
        }
        return meanings.get(word);
    }

    public void remove(String word) {
        meanings.remove(word);
    }
}