
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type 'end' to stop");

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("p")) {

                double averagePositive = numbers.stream()
                        .mapToInt(num -> Integer.valueOf(num))
                        .filter(number -> number >= 0)
                        .average()
                        .getAsDouble();

                System.out.println("Average of the positive numbers: " + averagePositive);
                break;
            }

            if (command.equals("n")) {
                double averageNegative = numbers.stream()
                        .mapToInt(num -> Integer.valueOf(num))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();

                System.out.println("Average of the negative numbers: " + averageNegative);
                break;
            }
            scanner.close();

        }
    }
}
