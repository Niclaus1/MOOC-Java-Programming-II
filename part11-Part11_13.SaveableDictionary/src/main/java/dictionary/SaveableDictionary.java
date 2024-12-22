package dictionary;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();

    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {

        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.values().contains(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        this.dictionary.remove(word);
        String delete = null;
        for (String value : this.dictionary.keySet()) {
            if (this.dictionary.get(value).equals(word)) {
                delete = value;
                break;
            }
        }
        if (delete != null) {
            this.dictionary.remove(delete);
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    add(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean save() {
        List<String> finalWords = new ArrayList<>();
        for (Map.Entry<String, String> value : this.dictionary.entrySet()) {
            finalWords.add(value.getKey() + ":" + value.getValue());
        }

        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String string : finalWords) {
                writer.write(string + System.lineSeparator());
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
