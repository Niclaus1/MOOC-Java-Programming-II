package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.load();
        s.translate("monkey");
    }
}
