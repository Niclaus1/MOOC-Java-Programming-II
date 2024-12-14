
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> word = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
                
            }

            word.add(input);
            
        }
        String value = word.stream()
        .reduce("", (previousString, words) -> previousString + words + "\n");

        System.out.println(value);
        scanner.close();
    }
}
