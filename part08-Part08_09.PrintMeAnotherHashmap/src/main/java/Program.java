
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
        
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (String text : hashmap.keySet()) {
            System.out.println(hashmap.get(text));
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        String textFind = formattedText(text);
        for (Book book : hashmap.values()) {
            if (book.getName().contains(textFind)) {
                System.out.println(book);

            }
        }
    }

    public static String formattedText(String string) {
        if (string == null) {
            string = "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
