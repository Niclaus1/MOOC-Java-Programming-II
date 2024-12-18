
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        books();

    }

    public static ArrayList<Book> books() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {

            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();

            if (input.isBlank()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageInput = Integer.valueOf(scanner.nextLine());

            Book book = new Book(input, ageInput);
            books.add(book);

        }

        System.out.println(books.stream().count() + " books in total.");

        System.out.println("");

        System.out.println("Books: ");

        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getBookName);
        Collections.sort(books, comparator);

        books.stream().forEach(p -> System.out.println(p));
        return books;
    }

}
