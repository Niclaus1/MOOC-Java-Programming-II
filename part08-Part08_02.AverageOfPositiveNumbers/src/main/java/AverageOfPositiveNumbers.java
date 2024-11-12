
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int sum = 0;

        while (true) {
            int values = Integer.valueOf(scanner.nextLine());

            if (values == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (values > 0) {
                total++;
                sum += values;
            }
        }
        double averageOfPositiveNumbers = sum / total;
        System.out.println(averageOfPositiveNumbers);
        scanner.close();
    }
}
