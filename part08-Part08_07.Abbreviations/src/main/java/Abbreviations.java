import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> words;

    public Abbreviations() {
        this.words = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        words.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        String text = formattedString(abbreviation);

        if (words.containsKey(text)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        String text = formattedString(abbreviation);

        if (!hasAbbreviation(text)) {
            return null;
        }
        return words.get(text);
    }

    public static String formattedString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }

}